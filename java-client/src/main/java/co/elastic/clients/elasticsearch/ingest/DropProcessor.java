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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest._types.DropProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.DropProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class DropProcessor extends ProcessorBase implements ProcessorVariant {
	// ---------------------------------------------------------------------------------------------

	private DropProcessor(Builder builder) {
		super(builder);

	}

	public static DropProcessor of(Function<Builder, ObjectBuilder<DropProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Drop;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DropProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<DropProcessor> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DropProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DropProcessor build() {
			_checkSingleUse();

			return new DropProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DropProcessor}
	 */
	public static final JsonpDeserializer<DropProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DropProcessor::setupDropProcessorDeserializer);

	protected static void setupDropProcessorDeserializer(ObjectDeserializer<DropProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);

	}

}
