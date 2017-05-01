var exec = require('cordova/exec');

exports.readText = function(arg0, success, error) {
    exec(success, error, "AndroidOCR", "readText", [arg0]);
};