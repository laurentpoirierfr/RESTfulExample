var bower_components = "../../bower_components/";

require.config({
	// By default load any module IDs from .
	baseUrl : '.',

	paths : {
		"jquery" : bower_components + "jquery/dist/jquery",
		"backbone" : bower_components + "backbone/backbone",
		"underscore" : bower_components + "underscore/underscore",
		"bootstrap" : bower_components + "bootstrap/dist/js/bootstrap",
		
		app : 'app'
	}
});

// Start the main app logic.
require([ 'app' ], function(App) {

	// jQuery, canvas and the app/sub module are all
	// loaded and can be used here now.

});