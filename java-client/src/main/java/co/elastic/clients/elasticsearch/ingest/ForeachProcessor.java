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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: ingest._types.ForeachProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.ForeachProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForeachProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final Processor processor;

	// ---------------------------------------------------------------------------------------------

	private ForeachProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.processor = ApiTypeHelper.requireNonNull(builder.processor, this, "processor");

	}

	public static ForeachProcessor of(Function<Builder, ObjectBuilder<ForeachProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Foreach;
	}

	/**
	 * Required - Field containing array or object values.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * If <code>true</code>, the processor silently exits without changing the
	 * document if the <code>field</code> is <code>null</code> or missing.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - Ingest processor to run on each element.
	 * <p>
	 * API name: {@code processor}
	 */
	public final Processor processor() {
		return this.processor;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		generator.writeKey("processor");
		this.processor.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForeachProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForeachProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private Processor processor;

		/**
		 * Required - Field containing array or object values.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * If <code>true</code>, the processor silently exits without changing the
		 * document if the <code>field</code> is <code>null</code> or missing.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - Ingest processor to run on each element.
		 * <p>
		 * API name: {@code processor}
		 */
		public final Builder processor(Processor value) {
			this.processor = value;
			return this;
		}

		/**
		 * Required - Ingest processor to run on each element.
		 * <p>
		 * API name: {@code processor}
		 */
		public final Builder processor(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.processor(fn.apply(new Processor.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForeachProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForeachProcessor build() {
			_checkSingleUse();

			return new ForeachProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForeachProcessor}
	 */
	public static final JsonpDeserializer<ForeachProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ForeachProcessor::setupForeachProcessorDeserializer);

	protected static void setupForeachProcessorDeserializer(ObjectDeserializer<ForeachProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::processor, Processor._DESERIALIZER, "processor");

	}

}
