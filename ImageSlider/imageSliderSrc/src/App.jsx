import KeyboardArrowRightOutlinedIcon from "@mui/icons-material/KeyboardArrowRightOutlined";
import NavigateBeforeOutlinedIcon from "@mui/icons-material/NavigateBeforeOutlined";
import { useState } from "react";
import "/home/bcs225/image-slider-practice/src/App.css";
import image2 from "/home/bcs225/image-slider-practice/src/avenue-815297_640.jpg";

const App = (props) => {
  const images = [
    "https://i.pinimg.com/1200x/a5/e9/94/a5e9949065b85e757a6fb97319d0d006.jpg",
    image2,
    "https://i.pinimg.com/236x/dd/97/3a/dd973ac116a977c8dd5296b0da504b8c.jpg",
  ];
  const [index, setIndex] = useState(0);

  const changeIndex = (i) => {
    setIndex(i);
  };
  const switchIndex = (i, isLeft) => {
    if (isLeft) setIndex(i === 0 ? images.length - 1 : i - 1);
    else setIndex(i === images.length - 1 ? 0 : i + 1);
  };

  return (
    <>
      <div className="imageArea">
        <img src={images[index]} alt=""></img>
      </div>
      <div className="menuArea">
        <NavigateBeforeOutlinedIcon
          onClick={() => switchIndex(index, true)}
          sx={{ mr: "10px", fontSize: "30px", cursor: "pointer" }}
        />
        {images.map((_, i) => (
          <div
            className={index === i ? "dots activeDot" : "dots inactiveDot"}
            onClick={() => changeIndex(i)}
          ></div>
        ))}
        <KeyboardArrowRightOutlinedIcon
          onClick={() => switchIndex(index, false)}
          sx={{ ml: "10px", fontSize: "30px", cursor: "pointer" }}
        />
      </div>
    </>
  );
};
export default App;
