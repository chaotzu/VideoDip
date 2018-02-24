package org.netzd.videodip;


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


public class VideoFragment extends Fragment {

    private VideoView reproductorView = null;


    public VideoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static VideoFragment newInstance() {
        VideoFragment fragment = new VideoFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //[1] Ocupamos el atributo para enlazarlo con el video
        reproductorView = (VideoView) getActivity().findViewById(R.id.reproductorVideoView);
        String video = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri videoUri = Uri.parse(video);

        reproductorView.setVideoURI(videoUri);
        reproductorView.start();

    }
}
