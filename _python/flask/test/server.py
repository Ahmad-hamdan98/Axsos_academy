from flask import Flask, render_template, request, redirect 
app = Flask(__name__)
# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("index.html")



@app.route('/users', methods=['POST'])
def create_user():
        print("Got Post Info")
        print(request.form)
        name_from_form = request.form['name']
        location_from_form = request.form['locations']
        name=request.form.get('language')
        textarea_from_form=request.form['text']
        return render_template("show.html", name_on_template=name_from_form , locations=location_from_form,text= textarea_from_form,lang=name)



if __name__ == "__main__":
    app.run(debug=True)
