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

package co.elastic.clients.elasticsearch.transform;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.Destination

/**
 *
 * @see <a href="../doc-files/api-spec.html#transform._types.Destination">API
 *      specification</a>
 */
@JsonpDeserializable
public class Destination implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String pipeline;

	// ---------------------------------------------------------------------------------------------

	private Destination(Builder builder) {

		this.index = builder.index;
		this.pipeline = builder.pipeline;

	}

	public static Destination of(Function<Builder, ObjectBuilder<Destination>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The destination index for the transform. The mappings of the destination
	 * index are deduced based on the source fields when possible. If alternate
	 * mappings are required, use the create index API prior to starting the
	 * transform.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * The unique identifier for an ingest pipeline.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
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

		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Destination}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Destination> {
		@Nullable
		private String index;

		@Nullable
		private String pipeline;

		/**
		 * The destination index for the transform. The mappings of the destination
		 * index are deduced based on the source fields when possible. If alternate
		 * mappings are required, use the create index API prior to starting the
		 * transform.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * The unique identifier for an ingest pipeline.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Destination}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Destination build() {
			_checkSingleUse();

			return new Destination(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Destination}
	 */
	public static final JsonpDeserializer<Destination> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Destination::setupDestinationDeserializer);

	protected static void setupDestinationDeserializer(ObjectDeserializer<Destination.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");

	}

}
