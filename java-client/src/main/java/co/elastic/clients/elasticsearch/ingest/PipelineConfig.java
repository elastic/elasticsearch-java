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

package co.elastic.clients.elasticsearch.ingest;

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
import java.lang.Long;
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

// typedef: ingest._types.PipelineConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.PipelineConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class PipelineConfig implements JsonpSerializable {
	@Nullable
	private final String description;

	@Nullable
	private final Long version;

	private final List<Processor> processors;

	// ---------------------------------------------------------------------------------------------

	private PipelineConfig(Builder builder) {

		this.description = builder.description;
		this.version = builder.version;
		this.processors = ApiTypeHelper.unmodifiableRequired(builder.processors, this, "processors");

	}

	public static PipelineConfig of(Function<Builder, ObjectBuilder<PipelineConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Description of the ingest pipeline.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Version number used by external systems to track ingest pipelines.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Required - Processors used to perform transformations on documents before
	 * indexing. Processors run sequentially in the order specified.
	 * <p>
	 * API name: {@code processors}
	 */
	public final List<Processor> processors() {
		return this.processors;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (ApiTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Processor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PipelineConfig> {
		@Nullable
		private String description;

		@Nullable
		private Long version;

		private List<Processor> processors;

		/**
		 * Description of the ingest pipeline.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Version number used by external systems to track ingest pipelines.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - Processors used to perform transformations on documents before
		 * indexing. Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processors</code>.
		 */
		public final Builder processors(List<Processor> list) {
			this.processors = _listAddAll(this.processors, list);
			return this;
		}

		/**
		 * Required - Processors used to perform transformations on documents before
		 * indexing. Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(Processor value, Processor... values) {
			this.processors = _listAdd(this.processors, value, values);
			return this;
		}

		/**
		 * Required - Processors used to perform transformations on documents before
		 * indexing. Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(ProcessorVariant value, ProcessorVariant... values) {
			this.processors = _listAdd(this.processors, value._toProcessor());
			for (ProcessorVariant v : values) {
				_listAdd(this.processors, v._toProcessor());
			}
			return this;
		}

		/**
		 * Required - Processors used to perform transformations on documents before
		 * indexing. Processors run sequentially in the order specified.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds a value to <code>processors</code> using a builder lambda.
		 */
		public final Builder processors(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return processors(fn.apply(new Processor.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PipelineConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineConfig build() {
			_checkSingleUse();

			return new PipelineConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineConfig}
	 */
	public static final JsonpDeserializer<PipelineConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PipelineConfig::setupPipelineConfigDeserializer);

	protected static void setupPipelineConfigDeserializer(ObjectDeserializer<PipelineConfig.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "processors");

	}

}
