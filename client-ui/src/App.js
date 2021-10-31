import logo from './logo.svg';
import Contacts from './components/Contacts';

import './App.css';

function App() {
  return (
    <div className="container-fluid">
      <nav>
        <div className="nav-wrapper center-align">
            <a href="/" className="brand-logo">Contacts</a>
        </div>
        <div className="row">
            <Contacts/>
        </div>

      </nav>
     
    </div>
  );
}

export default App;
