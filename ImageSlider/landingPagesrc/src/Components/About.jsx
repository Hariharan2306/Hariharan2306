import PlayArrowRoundedIcon from '@mui/icons-material/PlayArrowRounded';
import React from 'react';
import "/home/bcs225/landing-page/src/Styles/About.css";
import bowl from '/home/bcs225/landing-page/src/assets/about-background-image.png';
const About = () => {
  return (
    <div className='backgroundAbout'>
        <div className='about'>
            <img  className = 'saladBowl'src={bowl} alt=''/>
            <div>
                <span className='aboutSpan'>About</span>
                <h1>Food is an important part of A balanced <br/>diet</h1>
                <p>
                    Lorem ipsum dolor sit amet consectetur. Non tincidunt 
                    magna non et elit. Dolor  turpis molestie dui <br/>
                    magnis facilisis at fringilla quam.
                    <br/> <br/>
                    Non tincidunt magna non et elit. Dolor turpis molestie 
                    dui magnis facilisis at fringilla quam.
                </p>
                <div className='buttons'>
                    <span className='learnMore'>Learn More</span>
                    <div className='watchVideo'> 
                        <div className='playRound'><PlayArrowRoundedIcon fontSize='large' /></div>
                        <span>Watch Video</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

export default About;