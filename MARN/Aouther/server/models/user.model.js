const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema({
	name: {type:String,  required: [
		true,
		"Name is required"
	],minlength: [3,"Must be at least 3 char"]
},
	
	
});

const User = mongoose.model("User", UserSchema);

module.exports = User;