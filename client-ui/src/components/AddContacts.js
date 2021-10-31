import React ,  {Component} from 'react';

export default class AddContacts extends Component{
    submitContact(event){
        event.preventDefault();

        let contact = {
            firstName: this.refs.firstName.value,
            LastName: this.refs.lastName.value,
            email: this.refs.email.value,

        }

        fetch("http://localhost:8081/save" , {
            method: "POST",
            headers: {
                "content-type": "application/json",

            },
            body: JSON.stringify(contact),


        })
        .then(response => response.json());
        
        window.location.reload();
    }

    render(){
        return(

            <div className="row">
            <form className="col s12" onSubmit={this.submitContact.bind(this)}>
              <div className="row">
                <div className="input-field col s6">
                  <input placeholder="Placeholder" ref="first_name" type="text" className="validate"/>
                  <label htmlFor="first_name">First Name</label>
                </div>
                <div className="input-field col s6">
                  <input ref="last_name" type="text" className="validate"/>
                  <label htmlFor="last_name">Last Name</label>
                </div>
              </div>         
           
              <div className="row">
                <div className="input-field col s12">
                  <input ref="email" type="email" className="validate"/>
                  <label htmlFor="email">Email</label>
                </div>
              </div>
              <div className="row">
                    <button classNameName="waves-effect waves-light" type="submit" name="action">Submit</button>
              </div>
            </form>
          </div>
                

        )
    }
}