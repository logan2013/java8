function Parent(username) {
	this.username = username;

	this.sayHello = function() {
		return this.username;
	};
}

function Child(username, password) {

	this._method = Parent;
	this._method(username);
	delete this._method;

	this.password = password;

	this.sayWorld = function() {
		return this.password;
	};
}

var child = new Child("zhangsan", "123");

console.log(child.sayHello());
console.log(child.sayWorld());