(function() {

	if ([ 0 ]) {
		console.log([ 0 ] == true);
		console.log(!![ 0 ] == true);
	}

	if ("potato") {
		console.log("potato" == true);
		console.log("potato" == false);
	}

	var crazyObj = {
		toString : function() {
			return "2";
		}
	};
	
	console.log(crazyObj ==  2);
})();