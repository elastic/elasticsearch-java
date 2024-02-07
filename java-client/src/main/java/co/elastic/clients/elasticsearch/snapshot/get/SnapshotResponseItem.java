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

package co.elastic.clients.elasticsearch.snapshot.get;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch.snapshot.SnapshotInfo;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: snapshot.get.SnapshotResponseItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.get.SnapshotResponseItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotResponseItem implements JsonpSerializable {
	private final String repository;

	private final List<SnapshotInfo> snapshots;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private SnapshotResponseItem(Builder builder) {

		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshots = ApiTypeHelper.unmodifiable(builder.snapshots);
		this.error = builder.error;

	}

	public static SnapshotResponseItem of(Function<Builder, ObjectBuilder<SnapshotResponseItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshots}
	 */
	public final List<SnapshotInfo> snapshots() {
		return this.snapshots;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		generator.writeKey("repository");
		generator.write(this.repository);

		if (ApiTypeHelper.isDefined(this.snapshots)) {
			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (SnapshotInfo item0 : this.snapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotResponseItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotResponseItem> {
		private String repository;

		@Nullable
		private List<SnapshotInfo> snapshots;

		@Nullable
		private ErrorCause error;

		/**
		 * Required - API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>snapshots</code>.
		 */
		public final Builder snapshots(List<SnapshotInfo> list) {
			this.snapshots = _listAddAll(this.snapshots, list);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds one or more values to <code>snapshots</code>.
		 */
		public final Builder snapshots(SnapshotInfo value, SnapshotInfo... values) {
			this.snapshots = _listAdd(this.snapshots, value, values);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds a value to <code>snapshots</code> using a builder lambda.
		 */
		public final Builder snapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return snapshots(fn.apply(new SnapshotInfo.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotResponseItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotResponseItem build() {
			_checkSingleUse();

			return new SnapshotResponseItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotResponseItem}
	 */
	public static final JsonpDeserializer<SnapshotResponseItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotResponseItem::setupSnapshotResponseItemDeserializer);

	protected static void setupSnapshotResponseItemDeserializer(ObjectDeserializer<SnapshotResponseItem.Builder> op) {

		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(SnapshotInfo._DESERIALIZER), "snapshots");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
