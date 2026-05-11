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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.BaseIndicator

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.BaseIndicator">API
 *      specification</a>
 */

public abstract class BaseIndicator implements JsonpSerializable {
	private final IndicatorHealthStatus status;

	private final String symptom;

	private final List<Impact> impacts;

	private final List<Diagnosis> diagnosis;

	// ---------------------------------------------------------------------------------------------

	protected BaseIndicator(AbstractBuilder<?> builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.symptom = ApiTypeHelper.requireNonNull(builder.symptom, this, "symptom");
		this.impacts = ApiTypeHelper.unmodifiable(builder.impacts);
		this.diagnosis = ApiTypeHelper.unmodifiable(builder.diagnosis);

	}

	/**
	 * Required - API name: {@code status}
	 */
	public final IndicatorHealthStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code symptom}
	 */
	public final String symptom() {
		return this.symptom;
	}

	/**
	 * API name: {@code impacts}
	 */
	public final List<Impact> impacts() {
		return this.impacts;
	}

	/**
	 * API name: {@code diagnosis}
	 */
	public final List<Diagnosis> diagnosis() {
		return this.diagnosis;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("symptom");
		generator.write(this.symptom);

		if (ApiTypeHelper.isDefined(this.impacts)) {
			generator.writeKey("impacts");
			generator.writeStartArray();
			for (Impact item0 : this.impacts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.diagnosis)) {
			generator.writeKey("diagnosis");
			generator.writeStartArray();
			for (Diagnosis item0 : this.diagnosis) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private IndicatorHealthStatus status;

		private String symptom;

		@Nullable
		private List<Impact> impacts;

		@Nullable
		private List<Diagnosis> diagnosis;

		/**
		 * Required - API name: {@code status}
		 */
		public final BuilderT status(IndicatorHealthStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * Required - API name: {@code symptom}
		 */
		public final BuilderT symptom(String value) {
			this.symptom = value;
			return self();
		}

		/**
		 * API name: {@code impacts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>impacts</code>.
		 */
		public final BuilderT impacts(List<Impact> list) {
			this.impacts = _listAddAll(this.impacts, list);
			return self();
		}

		/**
		 * API name: {@code impacts}
		 * <p>
		 * Adds one or more values to <code>impacts</code>.
		 */
		public final BuilderT impacts(Impact value, Impact... values) {
			this.impacts = _listAdd(this.impacts, value, values);
			return self();
		}

		/**
		 * API name: {@code impacts}
		 * <p>
		 * Adds a value to <code>impacts</code> using a builder lambda.
		 */
		public final BuilderT impacts(Function<Impact.Builder, ObjectBuilder<Impact>> fn) {
			return impacts(fn.apply(new Impact.Builder()).build());
		}

		/**
		 * API name: {@code diagnosis}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>diagnosis</code>.
		 */
		public final BuilderT diagnosis(List<Diagnosis> list) {
			this.diagnosis = _listAddAll(this.diagnosis, list);
			return self();
		}

		/**
		 * API name: {@code diagnosis}
		 * <p>
		 * Adds one or more values to <code>diagnosis</code>.
		 */
		public final BuilderT diagnosis(Diagnosis value, Diagnosis... values) {
			this.diagnosis = _listAdd(this.diagnosis, value, values);
			return self();
		}

		/**
		 * API name: {@code diagnosis}
		 * <p>
		 * Adds a value to <code>diagnosis</code> using a builder lambda.
		 */
		public final BuilderT diagnosis(Function<Diagnosis.Builder, ObjectBuilder<Diagnosis>> fn) {
			return diagnosis(fn.apply(new Diagnosis.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBaseIndicatorDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::status, IndicatorHealthStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::symptom, JsonpDeserializer.stringDeserializer(), "symptom");
		op.add(AbstractBuilder::impacts, JsonpDeserializer.arrayDeserializer(Impact._DESERIALIZER), "impacts");
		op.add(AbstractBuilder::diagnosis, JsonpDeserializer.arrayDeserializer(Diagnosis._DESERIALIZER), "diagnosis");

	}

}
