import './ExploreContainer.css';
import { IonInput, IonItem, IonList, IonCard, IonCardHeader, IonCardTitle, IonIcon, IonButton } from '@ionic/react';
import { person} from 'ionicons/icons';
interface ContainerProps { }

const ExploreContainer: React.FC<ContainerProps> = () => {
  return (
    <div id="container">
      <IonCard>
        <IonCardHeader>
          <IonCardTitle>Iniciar seccion</IonCardTitle>
        </IonCardHeader>


      </IonCard>

      <IonList>
        <IonItem>
          <IonInput labelPlacement="stacked" label="Correo electronico" placeholder="Digite su correo" type='email'></IonInput>
        </IonItem>

        <IonItem>
          <IonInput labelPlacement="stacked" label="Contraseña" placeholder="Digite su contraseña" type='password'></IonInput>
        </IonItem>
      </IonList>


      <IonButton color="success" size="large">
        <IonIcon slot="start" icon={person}></IonIcon>
        Iniciar sesion
      </IonButton>
    </div>
  );
};

export default ExploreContainer;
