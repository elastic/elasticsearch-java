/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: snapshot._types.RepositorySettingsBase

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.RepositorySettingsBase">API
 *      specification</a>
 */

public abstract class RepositorySettingsBase implements JsonpSerializable {
	@Nullable
	private final String chunkSize;

	@Nullable
	private final Boolean compress;

	@Nullable
	private final String maxRestoreBytesPerSec;

	@Nullable
	private final String maxSnapshotBytesPerSec;

	// ---------------------------------------------------------------------------------------------

	protected RepositorySettingsBase(AbstractBuilder<?> builder) {

		this.chunkSize = builder.chunkSize;
		this.compress = builder.compress;
		this.maxRestoreBytesPerSec = builder.maxRestoreBytesPerSec;
		this.maxSnapshotBytesPerSec = builder.maxSnapshotBytesPerSec;

	}

	/**
	 * Big files can be broken down into multiple smaller blobs in the blob store
	 * during snapshotting. It is not recommended to change this value from its
	 * default unless there is an explicit reason for limiting the size of blobs in
	 * the repository. Setting a value lower than the default can result in an
	 * increased number of API calls to the blob store during snapshot create and
	 * restore operations compared to using the default value and thus make both
	 * operations slower and more costly. Specify the chunk size as a byte unit, for
	 * example: <code>10MB</code>, <code>5KB</code>, 500B. The default varies by
	 * repository type.
	 * <p>
	 * API name: {@code chunk_size}
	 */
	@Nullable
	public final String chunkSize() {
		return this.chunkSize;
	}

	/**
	 * When set to <code>true</code>, metadata files are stored in compressed
	 * format. This setting doesn't affect index files that are already compressed
	 * by default.
	 * <p>
	 * API name: {@code compress}
	 */
	@Nullable
	public final Boolean compress() {
		return this.compress;
	}

	/**
	 * The maximum snapshot restore rate per node. It defaults to unlimited. Note
	 * that restores are also throttled through recovery settings.
	 * <p>
	 * API name: {@code max_restore_bytes_per_sec}
	 */
	@Nullable
	public final String maxRestoreBytesPerSec() {
		return this.maxRestoreBytesPerSec;
	}

	/**
	 * The maximum snapshot creation rate per node. It defaults to 40mb per second.
	 * Note that if the recovery settings for managed services are set, then it
	 * defaults to unlimited, and the rate is additionally throttled through
	 * recovery settings.
	 * <p>
	 * API name: {@code max_snapshot_bytes_per_sec}
	 */
	@Nullable
	public final String maxSnapshotBytesPerSec() {
		return this.maxSnapshotBytesPerSec;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.chunkSize != null) {
			generator.writeKey("chunk_size");
			generator.write(this.chunkSize);

		}
		if (this.compress != null) {
			generator.writeKey("compress");
			generator.write(this.compress);

		}
		if (this.maxRestoreBytesPerSec != null) {
			generator.writeKey("max_restore_bytes_per_sec");
			generator.write(this.maxRestoreBytesPerSec);

		}
		if (this.maxSnapshotBytesPerSec != null) {
			generator.writeKey("max_snapshot_bytes_per_sec");
			generator.write(this.maxSnapshotBytesPerSec);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String chunkSize;

		@Nullable
		private Boolean compress;

		@Nullable
		private String maxRestoreBytesPerSec;

		@Nullable
		private String maxSnapshotBytesPerSec;

		/**
		 * Big files can be broken down into multiple smaller blobs in the blob store
		 * during snapshotting. It is not recommended to change this value from its
		 * default unless there is an explicit reason for limiting the size of blobs in
		 * the repository. Setting a value lower than the default can result in an
		 * increased number of API calls to the blob store during snapshot create and
		 * restore operations compared to using the default value and thus make both
		 * operations slower and more costly. Specify the chunk size as a byte unit, for
		 * example: <code>10MB</code>, <code>5KB</code>, 500B. The default varies by
		 * repository type.
		 * <p>
		 * API name: {@code chunk_size}
		 */
		public final BuilderT chunkSize(@Nullable String value) {
			this.chunkSize = value;
			return self();
		}

		/**
		 * When set to <code>true</code>, metadata files are stored in compressed
		 * format. This setting doesn't affect index files that are already compressed
		 * by default.
		 * <p>
		 * API name: {@code compress}
		 */
		public final BuilderT compress(@Nullable Boolean value) {
			this.compress = value;
			return self();
		}

		/**
		 * The maximum snapshot restore rate per node. It defaults to unlimited. Note
		 * that restores are also throttled through recovery settings.
		 * <p>
		 * API name: {@code max_restore_bytes_per_sec}
		 */
		public final BuilderT maxRestoreBytesPerSec(@Nullable String value) {
			this.maxRestoreBytesPerSec = value;
			return self();
		}

		/**
		 * The maximum snapshot creation rate per node. It defaults to 40mb per second.
		 * Note that if the recovery settings for managed services are set, then it
		 * defaults to unlimited, and the rate is additionally throttled through
		 * recovery settings.
		 * <p>
		 * API name: {@code max_snapshot_bytes_per_sec}
		 */
		public final BuilderT maxSnapshotBytesPerSec(@Nullable String value) {
			this.maxSnapshotBytesPerSec = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRepositorySettingsBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::chunkSize, JsonpDeserializer.stringDeserializer(), "chunk_size");
		op.add(AbstractBuilder::compress, JsonpDeserializer.booleanDeserializer(), "compress");
		op.add(AbstractBuilder::maxRestoreBytesPerSec, JsonpDeserializer.stringDeserializer(),
				"max_restore_bytes_per_sec");
		op.add(AbstractBuilder::maxSnapshotBytesPerSec, JsonpDeserializer.stringDeserializer(),
				"max_snapshot_bytes_per_sec");

	}

}
