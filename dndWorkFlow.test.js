import React from "react";
import { fireEvent, screen } from "@testing-library/react";
import { configure } from "enzyme";
import Adapter from "@wojtekmaj/enzyme-adapter-react-17";
import { render } from "../../../utils/testUtils";
import { Provider } from "react-redux";
import { createStore } from "redux";
import DndWorkFlow from "../../../components/new-studio/DndWorkFlow";
import { BrowserRouter } from "react-router-dom";
import * as SRD from "@projectstorm/react-diagrams";
import nodeMappings from "../../../components/new-studio/nodeMappings";

delete global.window.location;
global.window = Object.create(window);
global.window.location = {
  search: "?myParam=test",
};

jest.mock("../../../utils/PermissionUtils", () => {
  return {
    canAccess: () => {
      return true;
    },
  };
});

jest.mock("../../../utils/TokenUtils", () => {
  return {
    getUserGroups: () => {
      return ["developer"];
    },
    getLocalAccessToken: jest.fn(),
  };
});

jest.mock("@projectstorm/react-diagrams", () => {
  return {
    __esModule: true, //    <----- this __esModule: true is important
    ...jest.requireActual("@projectstorm/react-diagrams"),
    DiagramModel: class {
      setModel() {}
      getModel() {}
      setZoomLevel() {}
      addNode() {}
      getLayers() {
        return [];
      }
      getOffsetX() {
        return 0;
      }
      getOffsetY() {
        return 0;
      }
      getZoomLevel() {
        return 100;
      }
      deserializeModel() {}
      getSelectedEntities() {
        return [{ options: { color: "red", id: "1001" } }];
      }
      getSelectionEntities() {
        return [
          {
            options: { color: "red", id: "1001" },
            key: "data",
            name: "name",
            x: 50,
            y: 50,
            stepInfo: [{ key: "breakpoint" }],
            position: { x: 90, y: 50 },
          },
          {
            options: { color: "red", id: "1001", type: "in" },
            key: "data",
            name: "name",
            x: 50,
            y: 50,
            stepInfo: [{ key: "breakpoint" }],
            position: { x: 90, y: 50 },
          },
          {
            options: { color: "red", id: "1001", type: "inout" },
            key: "data",
            name: "name",
            x: 50,
            y: 50,
            stepInfo: [{ key: "breakpoint" }],
            position: { x: 90, y: 50 },
          },
          {
            options: { color: "red", id: "1001", type: "diamond" },
            key: "data",
            name: "name",
            x: 50,
            y: 50,
            stepInfo: [{ key: "breakpoint" }],
            position: { x: 90, y: 50 },
          },
          {
            options: {
              id: "968fddb8-1070-4b82-9989-c06f2af43c20",
              color: "rgba(255,255,255,0.5)",
              key: "Breakpoint",
              y: 60,
              curvyness: 50,
              extras: {},
              stepInfo: {},
            },
            position: { x: 90, y: 50 },
          },
        ];
      }
      serialize() {}
      getLinks() {
        return [
          {
            options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
            targetPort: {
              options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
              parent: {
                options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
              },
            },
            sourcePort: {
              options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
              parent: {
                options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
              },
            },
            getSourcePort: () => {
              return {
                getNode() {
                  return [
                    {
                      options: {
                        id: "968fddb8-1070-4b82-9989-c06f2af43c20",
                        color: "rgba(255,255,255,0.5)",
                        key: "Breakpoint",
                        y: 60,
                        curvyness: 50,
                        extras: {},
                        stepInfo: {},
                        id: "968fddb8-1070-4b82-9989-c06f2af43c20",
                      },
                    },
                  ];
                },
              };
            },
            getTargetPort: () => {
              return {
                getNode() {
                  return [
                    {
                      options: {
                        id: "968fddb8-1070-4b82-9989-c06f2af43c20",
                        color: "rgba(255,255,255,0.5)",
                        key: "Breakpoint",
                        y: 60,
                        curvyness: 50,
                        extras: {},
                        stepInfo: {},
                        id: "968fddb8-1070-4b82-9989-c06f2af43c20",
                      },
                    },
                  ];
                },
              };
            },
          },
        ];
      }
      getNodes() {
        return [
          {
            options: {
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              color: "rgba(255,255,255,0.5)",
              key: "Breakpoint",
              y: 60,
              curvyness: 50,
              extras: {},
              stepInfo: {},
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              types: "default",
            },
          },
          {
            options: {
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              color: "rgba(255,255,255,0.5)",
              key: "Breakpoint",
              y: 60,
              curvyness: 50,
              extras: {},
              stepInfo: {},
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              types: "default",
            },
          },
          {
            options: {
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              color: "rgba(255,255,255,0.5)",
              key: "Breakpoint",
              y: 60,
              curvyness: 50,
              extras: {},
              stepInfo: {},
              id: "678751de-ee40-4049-a09f-d6cbc90aba78",
              types: "default",
            },
            getPosition: () => {
              return {
                x: 12,
                y: 56,
              };
            },
          },
        ];
      }
      getNode() {
        return [
          {
            options: {
              id: "968fddb8-1070-4b82-9989-c06f2af43c20",
              color: "rgba(255,255,255,0.5)",
              key: "Breakpoint",
              y: 60,
              curvyness: 50,
              extras: {},
              stepInfo: {},
              id: "968fddb8-1070-4b82-9989-c06f2af43c20",
            },
          },
        ];
      }
      serialize() {
        return {
          layers: [
            {
              id: "a48d85b1-5d16-4e6d-aa4b-321e32a2d282",
              type: "diagram-links",
              isSvg: true,
              transformed: true,
              models: {
                "9f66dfd2-6ab0-4a8a-b9f3-a9feeacd8fa8": {
                  id: "9f66dfd2-6ab0-4a8a-b9f3-a9feeacd8fa8",
                  type: "default",
                  selected: false,
                  source: "b476718c-9b76-46eb-a41a-267254aaa14e",
                  sourcePort: "e54b9bf9-35ef-4ef9-8534-e2ec7abdb4a8",
                  target: "39d4546b-a7cd-4ad1-aa34-7a558beed4c0",
                  targetPort: "666a9b77-5274-4d0b-88f1-52d1083bead8",
                  points: [
                    {
                      id: "6f30b43f-6757-47aa-8da3-2036acf8b86b",
                      type: "point",
                      x: 213.515625,
                      y: 186.25,
                    },
                    {
                      id: "b44b1d8f-cab0-4c1d-93f8-7d3991cc68ad",
                      type: "point",
                      x: 328.5,
                      y: 197.25,
                    },
                  ],
                  labels: [],
                  width: 3,
                  color: "rgba(228,169,81)",
                  curvyness: 50,
                  selectedColor: "rgba(228,169,81)",
                },
              },
            },
            {
              id: "a48d85b1-5d16-4e6d-aa4b-321e32a2d282",
              type: "diagram-links",
              isSvg: true,
              transformed: true,
              models: {
                "9f66dfd2-6ab0-4a8a-b9f3-a9feeacd8fa8": {
                  id: "9f66dfd2-6ab0-4a8a-b9f3-a9feeacd8fa8",
                  type: "default",
                  selected: false,
                  source: "b476718c-9b76-46eb-a41a-267254aaa14e",
                  sourcePort: "e54b9bf9-35ef-4ef9-8534-e2ec7abdb4a8",
                  target: "39d4546b-a7cd-4ad1-aa34-7a558beed4c0",
                  targetPort: "666a9b77-5274-4d0b-88f1-52d1083bead8",
                  points: [
                    {
                      id: "6f30b43f-6757-47aa-8da3-2036acf8b86b",
                      type: "point",
                      x: 213.515625,
                      y: 186.25,
                    },
                    {
                      id: "b44b1d8f-cab0-4c1d-93f8-7d3991cc68ad",
                      type: "point",
                      x: 328.5,
                      y: 197.25,
                    },
                  ],
                  labels: [],
                  width: 3,
                  color: "rgba(228,169,81)",
                  curvyness: 50,
                  selectedColor: "rgba(228,169,81)",
                },
              },
            },
          ],
        };
      }
      activeNodeLayer() {
        return {};
      }
      activeLinkLayer() {
        return {};
      }
      models() {
        return {};
      }
      activeNodeLayer = {
        models: {
          "968fddb8-1070-4b82-9989-c06f2af43c20": {
            options: { name: "Breakpoint" },
          },
          key: "Global Variables",
        },
      };
      removeNode() {
        return {};
      }
      getLink() {
        return { getSourcePort: jest.fn(), getTargetPort: jest.fn() };
      }
      getSourcePort() {
        return {
          options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
          parent: { options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" } },
        };
      }
      getTargetPort() {
        return {
          options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" },
          parent: { options: { id: "678751de-ee40-4049-a09f-d6cbc90aba78" } },
        };
      }
      removeLink() {
        return {};
      }
    },
    DefaultNodeModel: class {
      addPort() {}
      setPosition() {}
      position() {
        return { x: 50, y: 50 };
      }
      key() {}
      stepInfo() {}
    },
    DiamondNodeModel: class {},
  };
});
configure({ adapter: new Adapter() });

const startingState = {
  studio: {
    templateData: [
      {
        processFlow: [
          {
            id: "d5cf3571-174b-47b0-892d-f7da97020ae9",
            key: "Breakpoint",
            name: "Breakpoint",
            children: [
              {
                id: "5a431692-8724-442e-a75f-cdb0800beb33",
                key: "Breakpoint",
              },
            ],
            y: 3.85546875,
            parents: [],
            order: 1,
          },
        ],
        template:
          '{"id":"141effd8-2959-4093-b261-e6fe856f912e","offsetX":0,"offsetY":0,"zoom":100,"gridSize":0,"layers":[{"id":"3ada8869-9740-4eb3-94c6-18f3714dac92","type":"diagram-nodes","isSvg":true,"transformed":true,"models":{"3abb65f0-c677-478c-a16c-1c6c987c7e91":{"id":"3abb65f0-c677-478c-a16c-1c6c987c7e91","type":"default","selected":true,"source":"d5cf3571-174b-47b0-892d-f7da97020ae9","sourcePort":"6e7116dd-aba7-489d-8952-edf03fc98929","target":"5a431692-8724-442e-a75f-cdb0800beb33","targetPort":"76efcb38-4f2b-4645-9602-ce275036c4a4","points":[{"id":"4449fc57-6ab3-49d0-a81a-011641ecd402","type":"point","x":426.9921875,"y":146.30859375},{"id":"39ee520a-0176-4b50-b7c3-194ce1dbefeb","type":"point","x":608.49609375,"y":186.30859375}],"labels":[],"width":1.5,"color":"rgba(228,169,81)","curvyness":50,"selectedColor":"rgba(228,169,81)"}}},{"id":"448ff7c1-2ddc-4aa4-a5d5-e194d082dafb","type":"diagram-nodes","isSvg":false,"transformed":true,"models":{"d5cf3571-174b-47b0-892d-f7da97020ae9":{"id":"d5cf3571-174b-47b0-892d-f7da97020ae9","type":"default","x":290.75390625,"y":3.85546875,"ports":[{"id":"46bb31f0-054d-455c-9b44-303a522af523","type":"default","x":291.9921875,"y":138.80859375,"name":"in-1","alignment":"left","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":[],"in":true,"label":"In"},{"id":"6e7116dd-aba7-489d-8952-edf03fc98929","type":"default","x":419.4921875,"y":138.80859375,"name":"out-1","alignment":"right","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["46bb31f0-054d-455c-9b44-303a522af523"],"portsOutOrder":["6e7116dd-aba7-489d-8952-edf03fc98929"]},"5a431692-8724-442e-a75f-cdb0800beb33":{"id":"5a431692-8724-442e-a75f-cdb0800beb33","type":"default","x":599.75390625,"y":43.85546875,"ports":[{"id":"76efcb38-4f2b-4645-9602-ce275036c4a4","type":"default","x":600.99609375,"y":178.80859375,"name":"in-1","alignment":"left","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":true,"label":"In"},{"id":"36b45999-0541-41f8-86da-22bce9e53c5d","type":"default","x":728.49609375,"y":178.80859375,"name":"out-1","alignment":"right","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":[],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["76efcb38-4f2b-4645-9602-ce275036c4a4"],"portsOutOrder":["36b45999-0541-41f8-86da-22bce9e53c5d"]}}}]}',
        stepInfo: [],
        stepInfoDetails: [
          {
            id: "d5cf3571-174b-47b0-892d-f7da97020ae9",
            key: "Breakpoint",
            name: "Breakpoint",
            stepInfo: {},
            children: [
              {
                id: "5a431692-8724-442e-a75f-cdb0800beb33",
                key: "Breakpoint",
              },
            ],
            y: 3.85546875,
            parents: [],
            order: 1,
          },
          {
            id: "9f66dfd2-6ab0-4a8a-b9f3-a9feeacd8fa8",
            key: "Breakpoint",
            name: "Breakpoint",
            stepInfo: {},
            children: [
              {
                id: "5a431692-8724-442e-a75f-cdb0800beb33",
                key: "Breakpoint",
              },
            ],
            y: 3.85546875,
            parents: [],
            order: 1,
          },
        ],
        templateName: "gd tesyt",
        templateOwners: [],
        useCase: "",
        cloudPlatform: "",
        osType: "",
        standard: false,
        jobOwners: [],
        templateId: "100085",
        jobType: "save",
        updatedOn: "2022-06-21T15:24:39.081Z",
        status: "Draft",
        template_id: 100108,
        totalData: 2,
      },
      { status: "Draft" },
      { totalCount: { count: 0 } },
      { totalAllCount: [{ count: 0 }] },
      { totalApprovedCount: [{ count: 0 }] },
      { totalDraftCount: [{ count: 0 }] },
      { totalPendingCount: [{ count: 0 }] },
      { totalPublishedCount: [{ count: 0 }] },
      { totalRejectedCount: [{ count: 0 }] },
    ],
  },
  isButtonEnabled: true,
  status: "Draft",
  match: { params: { id: "100001" } },
  groupInfo: {
    groupInfo: [
      { group: "JJT-RISE-ADMIN" },
      { group: "JJT-RISE-DEVELOPER" },
      { group: "JJT-RISE-TEST" },
    ],
  },
};

const props = { templateData: { status: "Draft", isButtonEnabled: true } };

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

jest.mock("../../../components/helpers/dnd/dndHelpers", () => ({
  checkEmailError: () => {
    return {
      isSequenceEnabled: true,
      sequenceNumber: 1,
    };
  },
  filterTileModel: () => {
    return [
      { menu: "tile_1", menuItems: ["Example Tile"] },
      { menu: "tile_4", menuItems: ["Example 4"] },
    ];
  },
  getDndmodel: () => {
    return [
      {
        menu: "tile_1",
        menuItems: [{ taskId: "DEFAULT" }, { taskId: "menuitems" }],
      },
    ];
  },
  getQueryParams: () => {
    return "test";
  },
  getNonGroupInfoData: () => {
    return ["app-rise-admin", "app-rise-developer"];
  },
}));

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

const stateTemplateData = {
  studio: {
    templateData: {
      description: "",
      isoUpdatedOn: "2022-07-21T10:17:37.603Z",
      jobs: [],
      status: "Draft",
      stepInfoDetails: [
        {
          id: "3abb65f0-c677-478c-a16c-1c6c987c7e91",
          key: "Breakpoint",
          name: "Breakpoint",
          stepInfo: {},
        },
      ],
      templateId: 100262,
      templateName: "Demo Template5",
      updatedOn: "21-07-2022 10:17:37",
      template:
        '{"id":"141effd8-2959-4093-b261-e6fe856f912e","offsetX":0,"offsetY":0,"zoom":100,"gridSize":0,"layers":[{"id":"3ada8869-9740-4eb3-94c6-18f3714dac92","type":"diagram-nodes","isSvg":true,"transformed":true,"models":{"3abb65f0-c677-478c-a16c-1c6c987c7e91":{"id":"3abb65f0-c677-478c-a16c-1c6c987c7e91","type":"default","selected":true,"source":"d5cf3571-174b-47b0-892d-f7da97020ae9","sourcePort":"6e7116dd-aba7-489d-8952-edf03fc98929","target":"5a431692-8724-442e-a75f-cdb0800beb33","targetPort":"76efcb38-4f2b-4645-9602-ce275036c4a4","points":[{"id":"4449fc57-6ab3-49d0-a81a-011641ecd402","type":"point","x":426.9921875,"y":146.30859375},{"id":"39ee520a-0176-4b50-b7c3-194ce1dbefeb","type":"point","x":608.49609375,"y":186.30859375}],"labels":[],"width":1.5,"color":"rgba(228,169,81)","curvyness":50,"selectedColor":"rgba(228,169,81)"}}},{"id":"448ff7c1-2ddc-4aa4-a5d5-e194d082dafb","type":"diagram-nodes","isSvg":false,"transformed":true,"models":{"d5cf3571-174b-47b0-892d-f7da97020ae9":{"id":"d5cf3571-174b-47b0-892d-f7da97020ae9","type":"default","x":290.75390625,"y":3.85546875,"ports":[{"id":"46bb31f0-054d-455c-9b44-303a522af523","type":"default","x":291.9921875,"y":138.80859375,"name":"in-1","alignment":"left","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":[],"in":true,"label":"In"},{"id":"6e7116dd-aba7-489d-8952-edf03fc98929","type":"default","x":419.4921875,"y":138.80859375,"name":"out-1","alignment":"right","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["46bb31f0-054d-455c-9b44-303a522af523"],"portsOutOrder":["6e7116dd-aba7-489d-8952-edf03fc98929"]},"5a431692-8724-442e-a75f-cdb0800beb33":{"id":"5a431692-8724-442e-a75f-cdb0800beb33","type":"default","x":599.75390625,"y":43.85546875,"ports":[{"id":"76efcb38-4f2b-4645-9602-ce275036c4a4","type":"default","x":600.99609375,"y":178.80859375,"name":"in-1","alignment":"left","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":true,"label":"In"},{"id":"36b45999-0541-41f8-86da-22bce9e53c5d","type":"default","x":728.49609375,"y":178.80859375,"name":"out-1","alignment":"right","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":[],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["76efcb38-4f2b-4645-9602-ce275036c4a4"],"portsOutOrder":["36b45999-0541-41f8-86da-22bce9e53c5d"]}}}]}',
    },
  },
};
const stateTemplateEmptyData = {
  studio: {
    templateData: {
      description: "",
      isoUpdatedOn: "2022-07-21T10:17:37.603Z",
      jobs: [],
      status: "Published",
      stepInfoDetails: [
        {
          id: "3abb65f0-c677-478c-a16c-1c6c987c7e00",
          key: "Breakpoint",
          name: "Breakpoint",
          stepInfo: {},
        },
      ],
      templateId: 100262,
      templateName: "Demo Template5",
      updatedOn: "21-07-2022 10:17:37",
      template:
        '{"id":"141effd8-2959-4093-b261-e6fe856f912e","offsetX":0,"offsetY":0,"zoom":100,"gridSize":0,"layers":[{"id":"3ada8869-9740-4eb3-94c6-18f3714dac92","type":"diagram-nodes","isSvg":true,"transformed":true,"models":{"3abb65f0-c677-478c-a16c-1c6c987c7e91":{"id":"3abb65f0-c677-478c-a16c-1c6c987c7e91","type":"default","selected":true,"source":"d5cf3571-174b-47b0-892d-f7da97020ae9","sourcePort":"6e7116dd-aba7-489d-8952-edf03fc98929","target":"5a431692-8724-442e-a75f-cdb0800beb33","targetPort":"76efcb38-4f2b-4645-9602-ce275036c4a4","points":[{"id":"4449fc57-6ab3-49d0-a81a-011641ecd402","type":"point","x":426.9921875,"y":146.30859375},{"id":"39ee520a-0176-4b50-b7c3-194ce1dbefeb","type":"point","x":608.49609375,"y":186.30859375}],"labels":[],"width":1.5,"color":"rgba(228,169,81)","curvyness":50,"selectedColor":"rgba(228,169,81)"}}},{"id":"448ff7c1-2ddc-4aa4-a5d5-e194d082dafb","type":"diagram-nodes","isSvg":false,"transformed":true,"models":{"d5cf3571-174b-47b0-892d-f7da97020ae9":{"id":"d5cf3571-174b-47b0-892d-f7da97020ae9","type":"default","x":290.75390625,"y":3.85546875,"ports":[{"id":"46bb31f0-054d-455c-9b44-303a522af523","type":"default","x":291.9921875,"y":138.80859375,"name":"in-1","alignment":"left","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":[],"in":true,"label":"In"},{"id":"6e7116dd-aba7-489d-8952-edf03fc98929","type":"default","x":419.4921875,"y":138.80859375,"name":"out-1","alignment":"right","parentNode":"d5cf3571-174b-47b0-892d-f7da97020ae9","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["46bb31f0-054d-455c-9b44-303a522af523"],"portsOutOrder":["6e7116dd-aba7-489d-8952-edf03fc98929"]},"5a431692-8724-442e-a75f-cdb0800beb33":{"id":"5a431692-8724-442e-a75f-cdb0800beb33","type":"default","x":599.75390625,"y":43.85546875,"ports":[{"id":"76efcb38-4f2b-4645-9602-ce275036c4a4","type":"default","x":600.99609375,"y":178.80859375,"name":"in-1","alignment":"left","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":["3abb65f0-c677-478c-a16c-1c6c987c7e91"],"in":true,"label":"In"},{"id":"36b45999-0541-41f8-86da-22bce9e53c5d","type":"default","x":728.49609375,"y":178.80859375,"name":"out-1","alignment":"right","parentNode":"5a431692-8724-442e-a75f-cdb0800beb33","links":[],"in":false,"label":"Out"}],"name":"Breakpoint","color":"blue","portsInOrder":["76efcb38-4f2b-4645-9602-ce275036c4a4"],"portsOutOrder":["36b45999-0541-41f8-86da-22bce9e53c5d"]}}}]}',
    },
  },
};

const appStoreData = [
  {
    appName: "",
    appType: "",
    appVisibility: "",
    appInformation: "",
    appLanguage: "abap",
    appLanguageType: "abap",
    appLanguageCategory: "",
    appId: 100038,
    status: "Draft",
    codeAffectedPercentage: 83,
  },
];

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

const saveDetails = () => jest.fn();
describe("DndWorkFlow", () => {
  beforeEach(() => {
    nodeMappings(
      "dds",
      "des",
      {},
      saveDetails,
      "",
      [],
      [],
      [],
      [],
      appStoreData
    );
  });

  it("renders without issue", () => {
    renderWithRedux(<DndWorkFlow />);
    const test = screen.getByTestId("dndWorkFlowTestId");
    expect(test).toBeInTheDocument();
  });
  it("on save Enabled", () => {
    const component = renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow />
      </BrowserRouter>
    );
    fireEvent.click(
      component.container.querySelector("#on-save"),
      jest.fn("save")
    );
  });
  it("on simulate Enabled", () => {
    const component = renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow />
      </BrowserRouter>
    );
    fireEvent.click(component.container.querySelector("#on-simulate"));
  });
  it("clone node Enabled", () => {
    const component = renderWithRedux(
      <DndWorkFlow
        isOtherOptionsRequired={true}
        multipleNodeId={["1001", "1002"]}
        singleNodeId="1001"
      />
    );
    fireEvent.click(component.container.querySelector("#on-clone-node"));
  });
  it("delete node", () => {
    const component = renderWithRedux(
      <DndWorkFlow
        isOtherOptionsRequired={true}
        multipleNodeId={["1001", "1002"]}
        singleNodeId="1001"
      />
    );
    fireEvent.click(component.container.querySelector("#on-delete-node"));
  });
  it("customize numbering", () => {
    const component = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(component.container.querySelector("#on-custom-sequence"));
  });
  it("on zoom out click", () => {
    const component = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(component.container.querySelector("#zoomOutIcon"));
  });
  it("on zoom in click", () => {
    const component = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(component.container.querySelector("#zoomInIcon"));
  });
  it("on zoom reset click", () => {
    const component = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(component.container.querySelector("#resetZoom"));
  });
  it("on node click", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(getByTestId("onNodeDropTestId"));
  });

  it("on node click", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(getByTestId("onNodeDropTestId"), { detail: 2 });
  });

  it("on node click with ctrlkey or metakey", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(getByTestId("onNodeDropTestId"), {
      detail: 2,
      ctrlKey: true,
      metakey: true,
      multipleNodeId: ["1001"],
      singleNodeId: "1001",
    });
  });

  it("on node click multiple node is not includes selectedentities options.id", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(getByTestId("onNodeDropTestId"), {
      detail: 2,
      ctrlKey: true,
      metakey: true,
      multipleNodeId: [""],
      singleNodeId: "1001",
    });
  });

  it("on node click multiple node is not includes selectedentities options.id", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />
    );
    fireEvent.click(getByTestId("onNodeDropTestId"), {
      detail: 2,
      multipleNodeId: ["1001"],
      singleNodeId: "1001",
    });
  });

  it("handle key down", () => {
    const { getByTestId } = renderWithRedux(
      <DndWorkFlow
        selectedNodeDetail={{ id: "67hjsbxajxk" }}
        isOtherOptionsRequired={true}
        isButtonEnabled={true}
        match={{ params: { id: "100085" } }}
        templateData={{ status: "Draft" }}
        {...startingState}
      />,
      { initialState: startingState }
    );
    fireEvent.keyDown(getByTestId("onNodeDropTestId"), { keyCode: 46 });
  });
  it("on node drop", () => {
    renderWithRedux(<DndWorkFlow isOtherOptionsRequired={true} />);
    const input = screen.getByTestId("onNodeDropTestId");
    fireEvent.drop(input, {
      dataTransfer: {
        getData: () =>
          JSON.stringify({ type: "inout", name: "node1", color: "red" }),
      },
    });
    fireEvent.drop(input, {
      dataTransfer: {
        getData: () =>
          JSON.stringify({ type: "in", name: "node2", color: "red" }),
      },
    });
    fireEvent.drop(input, {
      dataTransfer: {
        getData: () =>
          JSON.stringify({ type: "out", name: "node3", color: "red" }),
      },
    });
    fireEvent.drop(input, {
      dataTransfer: {
        getData: () =>
          JSON.stringify({ type: "diamond", name: "node4", color: "red" }),
      },
    });
  });

  it("filter modal data", () => {
    const { rerender } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />,
      { initialState: {} }
    );
    renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />,
      { initialState: stateTemplateData },
      rerender
    );
  });
  it("filter modal with empty data", () => {
    const { rerender } = renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />,
      { initialState: {} }
    );
    renderWithRedux(
      <DndWorkFlow isOtherOptionsRequired={true} />,
      { initialState: stateTemplateEmptyData },
      rerender
    );
  });
  it("load templates", () => {
    renderWithRedux(
      <DndWorkFlow
        isOtherOptionsRequired={true}
        match={{ params: { id: "100001" } }}
      />
    );
    const test = screen.getByTestId("dndWorkFlowTestId");
    expect(test).toBeInTheDocument();
  });
  it("on cancel", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow isOtherOptionsRequired={true} executeJobFlag={true} />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelTestId");
    fireEvent.click(input, "Simulate");
  });

  it("on cancel saveTemplateFlag", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          saveTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelTempTestId");
    fireEvent.click(input, "save");
  });
  it("handle Inputchange jobtitle", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("jobTitleTestId");
    fireEvent.change(input, { target: { id: "jobTitle", value: "jobTitle" } });
  });
  it("execute on close", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("executeJobCloseTestId");
    fireEvent.click(input, "execute");
  });
  it("onCancel close", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelSimulateTestId");
    fireEvent.click(input, "simulate");
  });
  it("save close", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelSaveTestId");
    fireEvent.click(input, "save");
  });
  it("save close", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelSaveTestId");
    fireEvent.click(input);
  });
  it("updatetemplate close", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          match={{ params: { id: "100001" } }}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelUpdatetemplateTestId");
    fireEvent.click(input, "updatetemplate");
  });
  it("updatetemplate close with empty", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelUpdatetemplateTestId");
    fireEvent.click(input, "");
  });
  it("updatetemplate close with empty", () => {
    renderWithRedux(
      <BrowserRouter>
        {" "}
        <DndWorkFlow
          simulateJobFlag={true}
          saveTemplateFlag={true}
          match={{ params: { id: "100001" } }}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onCancelUpdatetemplateTestId");
    fireEvent.click(input, "updatetemplate");
  });
  it("on drag over", () => {
    renderWithRedux(<DndWorkFlow isOtherOptionsRequired={true} />);
    fireEvent.dragOver(screen.getByTestId("onNodeDropTestId"), {
      preventDefault: () => jest.fn(),
    });
  });
  it("dndWorkFlowTestId", () => {
    renderWithRedux(
      <DndWorkFlow
        isOtherOptionsRequired={true}
        selectedNodeDetail={{ id: "67hjsbxajxk" }}
      />
    );
    fireEvent.click(screen.getByTestId("dndWorkFlowTestId"), {
      preventDefault: () => jest.fn(),
    });
  });

  it("tree value test id for taggle and select", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          isTrayWidgetVisible={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
          expandedMenu={["test"]}
          selectedMenu={["test"]}
        />
      </BrowserRouter>
    );
    fireEvent.click(screen.getByTestId("treeValueTestId"));
  });

  it("on node drop function", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          isTrayWidgetVisible={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
          expandedMenu={["test"]}
          selectedMenu={["test"]}
          isCanvaDisable={true}
          selectionBox={{ x: 123, y: 456, width: 98, height: 987 }}
          isDragging={true}
        />
      </BrowserRouter>
    );
    fireEvent.click(screen.getByTestId("onNodeDropTestId"));
  });

  it("on approve click", () => {
    renderWithRedux(
      <DndWorkFlow
        isOtherOptionsRequired={true}
        isButtonEnabled={true}
        match={{ params: { id: "100085" } }}
        templateData={{ status: "Draft" }}
      />,
      {
        initialState: startingState,
      }
    );
    const input = screen.getByTestId("dndWorkFlowTestId");
    fireEvent.click(input, jest.fn("100085", "Approved"));
  });
  it("on Execute Enabled", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          isOtherOptionsRequired={true}
          match={{ params: { id: "100085" } }}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onExecuteTestId");
    fireEvent.click(input, "Execute");
  });
  it("onExecuteTempTestId Enabled", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onExecuteTempTestId-save");
    fireEvent.click(input, "save");
  });
  it("onExecuteTempTestId Update template Enabled", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          match={{ params: { id: "100001" } }}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("onExecuteTempTestId-updatetemplate");
    fireEvent.click(input, "updatetemplate");
  });
  it("handle Inputchange templateNameTestId with save", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("templateNameTestId-save");
    fireEvent.change(input, { target: { id: "jobTitle", value: "jobTitle" } });
  });
  it("handle Inputchange templateNameTestId with updatetemplate", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("templateNameTestId-updatetemplate");
    fireEvent.change(input, { target: { id: "jobTitle", value: "jobTitle" } });
  });
  it("dndWorkStudioSubHeaderTestId", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const test = screen.getByTestId("dndWorkStudioSubHeaderTestId");
    expect(test).toBeInTheDocument();
  });
  it("tile search feild", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          isTrayWidgetVisible={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("tileSearchTestId");
    fireEvent.change(input, { target: { value: "test", id: "tileSearch" } });
  });
  it("tile search feild for empty value", () => {
    renderWithRedux(
      <BrowserRouter>
        <DndWorkFlow
          isTrayWidgetVisible={true}
          saveTemplateFlag={true}
          updateTemplateFlag={true}
          isOtherOptionsRequired={true}
          executeJobFlag={true}
        />
      </BrowserRouter>
    );
    const input = screen.getByTestId("tileSearchTestId");
    fireEvent.change(input, { target: { value: "", id: "tileSearch" } });
  });
  // it("groupInfo multiselect toggle", () => {
  //   renderWithRedux(
  //     <BrowserRouter>
  //       <DndWorkFlow isTrayWidgetVisible={true} saveTemplateFlag={true} groupInfoOpenTest={true} updateTemplateFlag={true} isOtherOptionsRequired={true} executeJobFlag={true} />
  //     </BrowserRouter>,
  //     { initialState: startingState },
  //   );
  //   fireEvent.click(screen.getByTestId("createdByToggleTestId-updatetemplate"));
  // });
});
