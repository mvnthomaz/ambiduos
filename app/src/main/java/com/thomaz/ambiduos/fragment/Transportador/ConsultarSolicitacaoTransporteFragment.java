package com.thomaz.ambiduos.fragment.Transportador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thomaz.ambiduos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConsultarSolicitacaoTransporteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle(R.string.title_solicitacoes);

        return inflater.inflate(R.layout.fragment_consultar_solicitacao_transporte, container, false);
    }

}
