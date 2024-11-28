import React from 'react';
import '/home/bcs225/landing-page/src/Styles/Help.css';

const Help = () => {
  return (
    <div className='help'>
        <h1>
            Have Question in Mind? <br/>
            let us help you
        </h1>
        <div className='inputBox'>
            <input placeholder='Enter Email' type='email' id='gmail'/>
            <div>Submit</div>
        </div>
    </div>
  )
}

export default Help;