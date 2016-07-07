(function() {

	function Person(username, password) {
		this.username = username;
		this.password = password;

		if (!Person.flag) {
			this.getInfo = function() {
				return this.username + this.password;
			};

			Person.flag = true;
		}
	}

	
	var person  = new Person("zhangsan", "123");
	
	console.log(person.getInfo());
	
	console.log(person.__proto__  == Person.prototype);
})();