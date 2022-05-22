import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './style.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>Manipulação de Containers</h1>
                    <a href="/container" rel="noreferrer">
                        <h3>Cadastrar</h3>
                    </a>
                    <a href="/move" rel="noreferrer">
                        <h3>Movimentar</h3>
                    </a>
                    <h3>Gerar Relatório</h3>
                    <a href="https://github.com/abysswalkerCaio" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/abysswalkerCaio</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;