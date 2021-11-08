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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.elasticsearch.indices.add_block.IndicesBlockStatus;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.add_block.Response
@JsonpDeserializable
public class AddBlockResponse extends AcknowledgedResponseBase {
	private final boolean shardsAcknowledged;

	private final List<IndicesBlockStatus> indices;

	// ---------------------------------------------------------------------------------------------

	private AddBlockResponse(Builder builder) {
		super(builder);

		this.shardsAcknowledged = ModelTypeHelper.requireNonNull(builder.shardsAcknowledged, this,
				"shardsAcknowledged");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

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

		if (ModelTypeHelper.isDefined(this.indices)) {
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
		 */
		public final Builder indices(List<IndicesBlockStatus> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(IndicesBlockStatus... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		@SafeVarargs
		public final Builder indices(Function<IndicesBlockStatus.Builder, ObjectBuilder<IndicesBlockStatus>>... fns) {
			this.indices = new ArrayList<>(fns.length);
			for (Function<IndicesBlockStatus.Builder, ObjectBuilder<IndicesBlockStatus>> fn : fns) {
				this.indices.add(fn.apply(new IndicesBlockStatus.Builder()).build());
			}
			return this;
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
			AddBlockResponse::setupAddBlockResponseDeserializer, Builder::build);

	protected static void setupAddBlockResponseDeserializer(DelegatingDeserializer<AddBlockResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(IndicesBlockStatus._DESERIALIZER), "indices");

	}

}
