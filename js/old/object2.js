(function() {

	function getInfo() {
		return this.username + this.password;
	}

	var createObject = function(username, password) {

		var object = new Object();

		object.username = username;
		object.password = password;

		object.getInfo = getInfo;

		return object;
	}

	var object = createObject("zhangsan", "123");
	console.log(object.getInfo());

})();