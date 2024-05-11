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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.elasticsearch.indices.add_block.IndicesBlockStatus;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: indices.add_block.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.add_block.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class AddBlockResponse extends AcknowledgedResponseBase {
	private final boolean shardsAcknowledged;

	private final List<IndicesBlockStatus> indices;

	// ---------------------------------------------------------------------------------------------

	private AddBlockResponse(Builder builder) {
		super(builder);

		this.shardsAcknowledged = ApiTypeHelper.requireNonNull(builder.shardsAcknowledged, this, "shardsAcknowledged");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static AddBlockResponse of(Function<Builder, ObjectBuilder<AddBlockResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<IndicesBlockStatus> indices() {
		return this.indices;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (IndicesBlockStatus item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AddBlockResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AddBlockResponse> {
		private Boolean shardsAcknowledged;

		private List<IndicesBlockStatus> indices;

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<IndicesBlockStatus> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(IndicesBlockStatus value, IndicesBlockStatus... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<IndicesBlockStatus.Builder, ObjectBuilder<IndicesBlockStatus>> fn) {
			return indices(fn.apply(new IndicesBlockStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AddBlockResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AddBlockResponse build() {
			_checkSingleUse();

			return new AddBlockResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AddBlockResponse}
	 */
	public static final JsonpDeserializer<AddBlockResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AddBlockResponse::setupAddBlockResponseDeserializer);

	protected static void setupAddBlockResponseDeserializer(ObjectDeserializer<AddBlockResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesBlockStatus._DESERIALIZER), "indices");

	}

}
