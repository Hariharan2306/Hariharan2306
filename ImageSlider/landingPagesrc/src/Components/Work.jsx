import React from 'react';
import "/home/bcs225/landing-page/src/Styles/work.css";
import up from "/home/bcs225/landing-page/src/assets/choose-image.png";
import delivery from "/home/bcs225/landing-page/src/assets/delivery-image.png";
import pickMeals from "/home/bcs225/landing-page/src/assets/pick-meals-image.png";

const Work = () => {
  return (
    <>
        <div className='how'>
            <span>Work</span>
            <h1>How It Works</h1>
            <p>
                Lorem ipsum dolor sit amet consectetur. Non tincidunt <br/>
                magna non et elit. Dolor  turpis molestie dui <br/>
                magnis facilisis at fringilla quam.
            </p>
        </div>
        <div className='charts'>
            <div className='chart'>
                <img src={pickMeals} alt=''/>
                <h3>Pick Meals</h3>
                <p>
                    Lorem ipsum dolor sit amet <br/> consectetur. Maecenas orci et <br/> sagittis duis elementum <br/>
                    interdum facilisi bibendum.
                </p>
            </div>
            <div className='chart'>
                <img src = {up} alt=''/>
                <h3>Choose How Often</h3>
                <p style={{marginTop:'20px'}}>
                    Lorem ipsum dolor sit amet <br/> consectetur. Maecenas orci et 
                </p>
            </div>
            <div className='chart'>
                <img src={delivery} alt=''/>
                <h3>Fast Deliveries</h3>
                <p>
                    Lorem ipsum dolor sit amet <br/> consectetur. Maecenas orci et <br/> lorem ipsum
                </p>
            </div>
        </div>
    </>
  )
}

export default Work;