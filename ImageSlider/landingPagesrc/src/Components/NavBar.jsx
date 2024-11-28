import ShoppingCartOutlinedIcon from "@mui/icons-material/ShoppingCartOutlined";
import "/home/bcs225/landing-page/src/Styles/NavBar.css";
import Logo from "/home/bcs225/landing-page/src/assets/Logo.svg";

function NavBar() {
  return (
      <div className="navbar">
        <div>
          <img className="logo" src={Logo} alt="" />
        </div>

        <div className="links">
          <a  className= "anchor" href="">Home</a>
          <a className= "anchor" href="">about</a>
          <a className= "anchor" href="">Testimonials</a>
          <a className= "anchor" href="">Contact</a>
          <a className= "anchor" href="">
            <ShoppingCartOutlinedIcon fontSize = 'large'/>
          </a>
          <a className= "anchor button" href="">Booking Now</a>
        </div>
        
      </div>
  );
}

export default NavBar;
