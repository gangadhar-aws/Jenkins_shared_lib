def call(String project, String Imagetag, String hubUser){
    sh """
        trivy image
        trivy image ${hubUser}/${project} ${hubUser}/${project}:latest > scan.txt
        cat scan.txt
        """
}