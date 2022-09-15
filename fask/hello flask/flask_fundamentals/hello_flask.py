from flask import Flask, render_template  # added render_template!
app = Flask(__name__)                     
@app.route("/")
def index():
    return "hello world"

@app.route("/dojo")
def HelloDojo():
    return "Dojo"

@app.route("/say/flask")
def HelloFlask():
    return "Hi Flask"
@app.route("/<name>/<t>")                           
def hello_world(name,t):
    # Instead of returning a string, 
    # we'll return the result of the render_template method, passing in the name of our HTML file
    return render_template('index.html',sname=name,time=int(t))  
    
if __name__=="__main__":
    app.run(debug=True)                   

