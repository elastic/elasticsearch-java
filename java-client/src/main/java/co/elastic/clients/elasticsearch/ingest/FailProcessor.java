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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.FailProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.FailProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class FailProcessor extends ProcessorBase implements ProcessorVariant {
	private final String message;

	// ---------------------------------------------------------------------------------------------

	private FailProcessor(Builder builder) {
		super(builder);

		this.message = ApiTypeHelper.requireNonNull(builder.message, this, "message");

	}

	public static FailProcessor of(Function<Builder, ObjectBuilder<FailProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Fail;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final String message() {
		return this.message;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("message");
		generator.write(this.message);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FailProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<FailProcessor> {
		private String message;

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(String value) {
			this.message = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FailProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FailProcessor build() {
			_checkSingleUse();

			return new FailProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FailProcessor}
	 */
	public static final JsonpDeserializer<FailProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FailProcessor::setupFailProcessorDeserializer);

	protected static void setupFailProcessorDeserializer(ObjectDeserializer<FailProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
