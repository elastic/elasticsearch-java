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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

// typedef: watcher.delete_watch.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher.delete_watch.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteWatchResponse implements JsonpSerializable {
	private final boolean found;

	private final String id;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private DeleteWatchResponse(Builder builder) {

		this.found = ApiTypeHelper.requireNonNull(builder.found, this, "found");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static DeleteWatchResponse of(Function<Builder, ObjectBuilder<DeleteWatchResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public final long version() {
		return this.version;
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

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_version");
		generator.write(this.version);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteWatchResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DeleteWatchResponse> {
		private Boolean found;

		private String id;

		private Long version;

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteWatchResponse build() {
			_checkSingleUse();

			return new DeleteWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteWatchResponse}
	 */
	public static final JsonpDeserializer<DeleteWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteWatchResponse::setupDeleteWatchResponseDeserializer);

	protected static void setupDeleteWatchResponseDeserializer(ObjectDeserializer<DeleteWatchResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
