import { Link } from 'react-router-dom';
import './style.css';

function Container() {
    return (
        <div className="container-form-container">
            <div className="container-card-bottom-container">
                <h3>Cadastrar Container</h3>
                <form className="container-form">
                    <div className="form-group container-form-group">
                        <label htmlFor="nameClient">Nome do Cliente:</label>
                        <input type="text" className="form-control" id="nameClient" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="nameContainer">Nome do Container:</label>
                        <input type="text" className="form-control" id="nameContainer" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="type">Tipo:</label>
                        <select className="form-control" id="type">
                            <option>20</option>
                            <option>40</option>
                        </select>
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="status">Status:</label>
                        <select className="form-control" id="status">
                            <option>Cheio</option>
                            <option>Vazio</option>
                        </select>
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="category">Categoria:</label>
                        <select className="form-control" id="category">
                            <option>Importação</option>
                            <option>Exportação</option>
                        </select>
                    </div>
                    <div className="container-form-btn-container">
                        <button type="submit" className="btn btn-primary container-btn">Cadastrar</button>
                    </div>
                </form >
                <Link to="/">
                    <button className="btn btn-primary container-btn mt-3">Cancelar</button>
                </Link>
            </div >
        </div >
    );
}

export default Container;