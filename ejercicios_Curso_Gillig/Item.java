package ejercicios_Curso_Gillig;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.ArrayList;

public class Item  implements Handler {
    private ArrayList<Ropa>items;

    public Item(ArrayList<Ropa> items) {
        this.items = items;
    }

    public ArrayList<Ropa> getItems() {
        return items;
    }

    public void setItems(ArrayList<Ropa> items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content Type","text/plain: charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Ropa i: items){
            result.append(i+"/n");


        }
        serverResponse.send(result);
    }



}
