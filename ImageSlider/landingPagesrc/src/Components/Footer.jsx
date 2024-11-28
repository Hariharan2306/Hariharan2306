import FacebookIcon from '@mui/icons-material/Facebook';
import LinkedInIcon from '@mui/icons-material/LinkedIn';
import TwitterIcon from '@mui/icons-material/Twitter';
import YouTubeIcon from '@mui/icons-material/YouTube';
import React from 'react';
import '/home/bcs225/landing-page/src/Styles/Footer.css';
const Footer = () => {
  return (
    <div className='footer'>
        <div className='foodie'> 
            <span>foodie</span>
            <div>
                <a href=''><TwitterIcon/></a>
                <a href=''><LinkedInIcon/></a>
                <a href=''><YouTubeIcon/></a>
                <a href=''><FacebookIcon/></a>
            </div>
        </div>
        <div className='links'>
            <div className='foodie link'>
                <a href=''>quality</a>
                <a href=''>help</a>
                <a href=''>share</a>
                <a href=''>careers</a>
                <a href=''>work</a>
                <a href=''>testimonials</a>
            </div>
            <div className='foodie link'>
                <p>244-5333-7783</p>
                <a href=''>hello@food.com</a>
                <a href=''>press@food.com</a>
                <a href=''>contact@food.com</a>
            </div>
            <div className='foodie link link3'>
                <a href=''>Terms & conditions</a>
                <a href=''>privacy policy</a>
            </div>
        </div>
    </div>
  )
}

export default Footer;