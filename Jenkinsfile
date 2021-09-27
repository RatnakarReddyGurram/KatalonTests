node('uswaukatcli02') {
    
    
    stage('Execute tests'){
   
   executeKatalon executeArgs: '-retry=0 -testSuitePath="Test Suites/SmokeTests" -executionProfile="QA" -browserType="Chrome" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true', location: 'C:\\Users\\900015183\\Desktop\\Katalon_Studio_Engine_Windows_64-8.0.5', version: '', x11Display: '', xvfbConfiguration: ''
  
    }
    stage('Upload to Results to TestRail'){
   pangolinTestRail(testRailProject:'Sandbox',configs: [[failIfUploadFailed: false, format: 'junit', milestonePath: 'Sprint20210829', resultPattern: '**/Reports/*/SmokeTests/*/*.xml', testPath: 'Smoke Tests', testRun: 'Smoke Test Run Sprint123']])
}
