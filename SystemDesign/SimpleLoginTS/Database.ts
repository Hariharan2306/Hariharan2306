import { User } from "./User";

export class Database {
  public static userDetails: Map<string, User> = new Map<string, User>();
}
