import EastIcon from '@mui/icons-material/East';
import React from 'react';
import NavBar from './NavBar';
import "/home/bcs225/landing-page/src/Styles/Home.css";
import bowl from "/home/bcs225/landing-page/src/assets/home-banner-image.png";

const Home = () => {
  return (
    <div className='background'>
      <NavBar/>
      <div className='frstPageContent'>
        <div className='favFood'>
          <h1 className=''>Your favourite food Delivered Hot & Fresh</h1>
          <p>
            Healthy switcher chefs do all the prep work, like peeding, chopping, 
            marinating, so you can cook a fresh food.
          </p>
          <span>Order Now <EastIcon sx={{ml:'5px'}} /></span>
        </div>
        <img className='eggBowl' src={bowl} alt=''/>
      </div>
      </div>
      
  )
}

export default Home;