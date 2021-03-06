import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from 'pages/Listing';
import Container from 'pages/Container';
import Move from 'pages/Move';
import Report from 'pages/Report';
import Navbar from "components/Navbar";
import Footer from "components/Footer";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Footer />
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/container" element={<Container />} />
        <Route path="/move" element={<Move />} />
        <Route path="/report" element={<Report />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;