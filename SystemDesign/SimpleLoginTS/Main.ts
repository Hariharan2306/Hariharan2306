import promptSync from "prompt-sync";
import { Database } from "./Database";
import { User } from "./User";

const prompt = promptSync();

class Main {
  public static main() {
    let choice: string;
    do {
      console.log(
        "Welcome to Login System. \n\nPress 1 to proceed with Login: \nPress 2 to proceed with Signup: \nPress any other key to exit. "
      );
      choice = prompt("Choice: ");
      switch (choice) {
        case "1":
          Main.login();
          break;
        case "2":
          Main.signup();
          break;
        default:
          console.log("Exiting... Thank you!");
          break;
      }
    } while (choice === "1" || choice == "2");
  }
  private static signup() {
    console.log("Proceeding with Signup...");
    let username: string = "";
    do {
      username = prompt("Enter Username: ");

      if (Database.userDetails.has(username)) {
        console.log("Username exists. Please try another.\n");
        username = "";
      }
    } while (!username || username.length === 0);

    const password = prompt("Enter Password: ", { echo: "*" });
    const user = new User(username, password);
    Database.userDetails.set(username, user);

    console.log(`User Creation Successful! ${username}\n\n`);
  }

  private static login() {
    console.log("Proceeding with Login...");
    const username = prompt("Enter Username: ");
    const password = prompt("Enter Password: ", { echo: "*" });
    if (!Database.userDetails.has(username)) {
      console.log("Username does not exist.\n\n");
      return;
    }
    const user = Database.userDetails.get(username);
    if (user?.getPassword() !== password) {
      console.log("Incorrect Password.\n\n");
      return;
    }
    console.log(`Login Successful! Welcome ${user?.getUsername()}\n\n`);
  }
}

Main.main();
