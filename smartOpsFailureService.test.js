jest.mock("../../server/utils/logger", () => ({
  logger: {
    info: jest.fn(),
    debug: jest.fn(),
    error: jest.fn(),
  },
}));

jest.mock("node-rfc", () => {
  class Client {
    connect = jest.fn();
    call = jest.fn();
    invoke = jest.fn();
  }
  return { Client };
});

jest.mock("../../server/services/dbServices", () => ({
  findAllScript: jest.fn().mockRejectedValue("error"),
  findScript: () => {
    return { _id: 1, sid: 1, configs: 1 };
  },
  updateScript: jest.fn().mockRejectedValue("error"),
  deleteOneScript: jest.fn().mockRejectedValue("error"),
  getNextSequenceValue: jest.fn(),
}));

describe("Sid and Global Config services test", () => {
  test("Test get global config list function", async () => {
    const {
      getSidConfigListService,
    } = require("../../server/services/smartOpsServices");

    await getSidConfigListService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test get global config list function", async () => {
    const {
      addSIDConfigurationService,
    } = require("../../server/services/smartOpsServices");

    await addSIDConfigurationService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test get global config list function", async () => {
    const {
      updateSidConfigService,
    } = require("../../server/services/smartOpsServices");

    await updateSidConfigService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test get global config list function", async () => {
    const {
      deleteSidConfigService,
    } = require("../../server/services/smartOpsServices");

    await deleteSidConfigService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test add sid function", async () => {
    const {
      addSIDConfigurationService,
    } = require("../../server/services/smartOpsServices");

    await addSIDConfigurationService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test delete sid config function", async () => {
    const {
      deleteSidConfigService,
    } = require("../../server/services/smartOpsServices");

    await deleteSidConfigService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test update sid config function", async () => {
    const {
      updateSidConfigService,
    } = require("../../server/services/smartOpsServices");

    await updateSidConfigService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test fetch sid config details function", async () => {
    const {
      getSidConfigDetailsService,
    } = require("../../server/services/smartOpsServices");

    await getSidConfigDetailsService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
  test("Test fetch sid config list function", async () => {
    const {
      getSidConfigListService,
    } = require("../../server/services/smartOpsServices");

    await getSidConfigListService().catch((err) => {
      expect(err.message).toBeDefined();
    });
  });
});
