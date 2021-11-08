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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.shrink.Response
@JsonpDeserializable
public class ShrinkResponse extends AcknowledgedResponseBase {
	private final boolean shardsAcknowledged;

	private final String index;

	// ---------------------------------------------------------------------------------------------

	private ShrinkResponse(Builder builder) {
		super(builder);

		this.shardsAcknowledged = ModelTypeHelper.requireNonNull(builder.shardsAcknowledged, this,
				"shardsAcknowledged");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static ShrinkResponse of(Function<Builder, ObjectBuilder<ShrinkResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

		generator.writeKey("index");
		generator.write(this.index);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShrinkResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShrinkResponse> {
		private Boolean shardsAcknowledged;

		private String index;

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShrinkResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShrinkResponse build() {
			_checkSingleUse();

			return new ShrinkResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShrinkResponse}
	 */
	public static final JsonpDeserializer<ShrinkResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShrinkResponse::setupShrinkResponseDeserializer, Builder::build);

	protected static void setupShrinkResponseDeserializer(DelegatingDeserializer<ShrinkResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");

	}

}
