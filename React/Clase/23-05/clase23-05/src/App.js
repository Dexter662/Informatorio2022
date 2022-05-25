import 'bootstrap/dist/css/bootstrap.min.css';
import './Assets/css/App.css';
import Header from './Componentes/Header';
import Contenido from './Componentes/Contenido';
import Footer from './Componentes/Footer';

function App() {
  
  return (
    <div className="App">
      <Header/>
      <Contenido />
      <Footer/>
    </div>
  );
}

export default App;
