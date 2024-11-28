import React from 'react';
import ReactDOM from 'react-dom/client';
import About from './Components/About';
import Footer from './Components/Footer';
import Help from './Components/Help';
import Home from './Components/Home';
import Testimonial from './Components/Testimonial';
import Work from './Components/Work';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <div style={{backgroundColor: '#f5f5f0'}}>
      <Home />
      <About/>
      <Work/>
      <Testimonial/>
      <Help/>
      <Footer/>
    </div>
  </React.StrictMode>
);