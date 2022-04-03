package ch.ag.me.springwebdemo.service.rest.synedra;

public class SynedraV21RestService implements SynedraRestService {

    private final SynedraRestService restService;

    public SynedraV21RestService(SynedraRestService restService) {
        this.restService = restService;
    }
}
