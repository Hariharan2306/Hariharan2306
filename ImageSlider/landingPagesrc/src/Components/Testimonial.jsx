import StarIcon from '@mui/icons-material/Star';
import React from 'react';
import '/home/bcs225/landing-page/src/Styles/Testimonial.css';
import JohnDoe from '/home/bcs225/landing-page/src/assets/john-doe-image.png';

const Testimonial = () => {
  return (
    <div className='testimonial'>
        <div>
            <p className='subhead'>Testimonial</p>
            <h1 className='whatSaying'>what they are saying</h1>
            <p className='lorem'>
                Lorem ipsum dolor sit amet consectetur. Non tincidunt <br/>
                magna non et elit. Dolor  turpis molestie dui <br/>
                magnis facilisis at fringilla quam.
            </p>
        </div>
        <div className='johndoe'>
            <img src = {JohnDoe} alt=''/>
            <p className='lorem'>
                Lorem ipsum dolor sit amet consectetur. Non tincidunt <br/>
                magna non et elit. Dolor  turpis molestie dui <br/>
                magnis facilisis at fringilla quam.
            </p>
            <div className='stars'>
                <StarIcon/>
                <StarIcon/>
                <StarIcon/>
                <StarIcon/>
                <StarIcon/>
            </div>
            <p>John Doe</p>
        </div>
    </div>
  )
}

export default Testimonial;