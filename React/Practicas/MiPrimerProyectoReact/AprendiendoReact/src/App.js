import logo from './assets/images/logo.svg';
import './assets/css/App.css';

//Inicio importar componentes
import MiComponente from './components/MiComponente';
//Fin importar componentes

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <img src={logo} className="App-logo" alt="logo" />
        <p>
          Aprendiendo React desde 0.
        </p>
      </header>
      <section className='componentes'>
        <MiComponente />
      </section>
    </div>
  );
}

export default App;
