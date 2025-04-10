/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
module.exports = function() {

    return {
        targets: ['e2eSetup'],
        config: function(data, conf) {
            conf.e2eSetup = {

                // base smartedit files
                headerContent: `<script src="/jsTests/e2e/util/generated_outerBackendMocksUtils.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/PageContentSlotsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/PageContentComponentSlotsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/pageContentSlotsContainerMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/pageMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/pageVersionMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/siteAndCatalogsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/productMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/angularJSI18nMock.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/restrictionsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/LanguagesMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/slotTypeRestrictionsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/synchronizationMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/configurationMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/componentMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/componentTypesMocks.js"></script>        
        <script src="/jsTests/e2e/util/commonMockedModule/perspectivesMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/mediaMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/userGroupsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/dragAndDropAndRemoveMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/permissionsMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/workflowInboxMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/workflowMocks.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/whoAmIMock.js"></script>
        <script src="/jsTests/e2e/util/commonMockedModule/goToCustomView.js"></script>
        <style>
            .offset{
                margin-top:50px
            }
            .y-add-btn {
                height: inherit !important;
            }
        </style>`,

                // path and file to output to
                // the path must be either absolute or relative to the root of the extension
                dest: smartedit.bundlePaths.test.e2e.applicationPath
            };

            conf.e2eSetup.smarteditContent = `<script src="/jsTests/e2e/util/commonMockedModule/i18nMock.js"></script>` + conf.options.smarteditContent;

            return conf;
        }
    };
};
