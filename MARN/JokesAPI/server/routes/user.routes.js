const UserController = require("../controllers/user.controller");

module.exports = app => {
  app.get("/api/users/", UserController.findAllJokes);
  app.get("/api/users/random", UserController.randomJokes);
  app.get("/api/users/:id", UserController.findOneSingleJokes);
  app.put("/api/users/update/:id", UserController.updateExistingJokes);
  app.post("/api/users/new", UserController.createNewJokes);
  app.delete("/api/users/delete/:id", UserController.deleteAnExistingJokes);
};