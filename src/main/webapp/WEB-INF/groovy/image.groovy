import com.google.appengine.api.blobstore.*

def blob = new BlobKey(params.id)
// blob.serve response

log.info "image blob key=" + params + ", blob=>" + blob.info

response.contentType = blob.info.contentType
// blobstore.serve(blob, response)
blob.serve response
// sout << blob.image.imageData
