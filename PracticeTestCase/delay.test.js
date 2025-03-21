import React from "react";
import { fireEvent, screen } from "@testing-library/react";
import { configure, shallow } from "enzyme";
import Adapter from "@wojtekmaj/enzyme-adapter-react-17";
import Delay from "../../../components/new-studio/nodeComponents/Delay";
import { render } from "../../../utils/testUtils";
import { Provider } from "react-redux";
import { createStore } from "redux";

configure({ adapter: new Adapter() });

const startingState = { count: 0 };
function reducer(state = startingState, action) {
  switch (action.type) {
    case 1:
      return state;
    case 2:
      return state;
    default:
      return state;
  }
}

const initialLoad = {
  studio: {
    validateTileInputs: true,
  },
};
const initialFalseLoad = {
  studio: {
    validateTileInputs: false,
  },
};

function renderWithRedux(
  component,
  { initialState, store = createStore(reducer, initialState) } = {},
  rerender
) {
  const renderComponent = rerender ? rerender : render;
  return {
    ...renderComponent(<Provider store={store}>{component}</Provider>),
  };
}
const stateData = { delayMode: "Delay" };
const saveDetails = jest.fn();

describe("delay", () => {
  it("renders without issue", () => {
    renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    const test = screen.getByTestId("delayStepTestId");
    expect(test).toBeInTheDocument();
  });
  it("renders without issue validation", () => {
    const { rerender } = renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />,
      {
        initialState: initialFalseLoad,
      }
    );
    renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />,
      { initialState: initialLoad },
      rerender
    );
  });
  it("Delay Inputfield", () => {
    const component = renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    fireEvent.click(component.container.querySelector("#delayMode-0"), {
      target: { name: "test", value: "Delay" },
    });
  });
  it("Trigger Step Manually Inputfield", () => {
    const component = renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    fireEvent.click(component.container.querySelector("#delayMode-1"), {
      target: { name: "test", value: "Trigger Step Manually" },
    });
  });

  it("handleInputChange", () => {
    renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    const input = screen.getByTestId("noOfMinutesTestId");
    fireEvent.change(input, { target: { name: "test" } });
  });
  it("handleChange", () => {
    const { getByText } = render(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    fireEvent.click(getByText("Step Description"));
  });
  it("handleComponentType", () => {
    const { getByText } = render(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    fireEvent.click(getByText("Step Description"));
  });
  it("otherDetails", () => {
    const { getByText } = render(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        saveDetails={() => saveDetails()}
      />
    );
    fireEvent.click(getByText("Step Description"));
  });
  it("render delay step", () => {
    renderWithRedux(
      <Delay
        data={{ currentSelectedCopyModeStep: { 0: false, 1: false } }}
        jobName="100025"
        saveDetails={() => saveDetails()}
      />,
      { initialState: stateData }
    );
    fireEvent.change(screen.getByTestId("delayStepTestId"));
  });
});
