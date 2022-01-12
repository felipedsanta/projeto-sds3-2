import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar() {

    return(
        <header>
            <nav className="container">
                <div className="fsmovie-nav-content">
                    <h1>FSMovie</h1>
                    <a href="https://github.com/felipedsanta"> 
                        <div className="fsmovie-contact-container">
                            <GithubIcon />
                            <p className="fsmovie-contact-link">/felipedsanta</p>
                        </div>
                    </a>
                </div>
            </nav>
      </header>
    );

}

export default Navbar;