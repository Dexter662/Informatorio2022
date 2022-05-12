import logo from './img/informatorio.png';
import './App.css';
import Noticia from './components/Noticia.js';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Etapa 3 Clase React.
        </p>
      </header>
      <Noticia></Noticia>
    </div>
  )
}

export default App;
