import React ,  {Component} from 'react';

export default class AddContacts extends Component{
    render(){
        return(

            <div class="row">
            <form class="col s12" onSubmit={this.submitContact.bind(this)}>
              <div class="row">
                <div class="input-field col s6">
                  <input placeholder="Placeholder" id="first_name" type="text" class="validate">
                  <label for="first_name">First Name</label>
                </div>
                <div class="input-field col s6">
                  <input id="last_name" type="text" class="validate">
                  <label for="last_name">Last Name</label>
                </div>
              </div>         
           
              <div class="row">
                <div class="input-field col s12">
                  <input id="email" type="email" class="validate">
                  <label for="email">Email</label>
                </div>
              </div>
              <div class="row">
                
              </div>
            </form>
          </div>
                

        )
    }
}