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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.ProcessorContainer
@JsonpDeserializable
public class Processor implements TaggedUnion<Object>, JsonpSerializable {

	public static final String ATTACHMENT = "attachment";
	public static final String APPEND = "append";
	public static final String CSV = "csv";
	public static final String CONVERT = "convert";
	public static final String DATE = "date";
	public static final String DATE_INDEX_NAME = "date_index_name";
	public static final String DOT_EXPANDER = "dot_expander";
	public static final String ENRICH = "enrich";
	public static final String FAIL = "fail";
	public static final String FOREACH = "foreach";
	public static final String JSON = "json";
	public static final String USER_AGENT = "user_agent";
	public static final String KV = "kv";
	public static final String GEOIP = "geoip";
	public static final String GROK = "grok";
	public static final String GSUB = "gsub";
	public static final String JOIN = "join";
	public static final String LOWERCASE = "lowercase";
	public static final String REMOVE = "remove";
	public static final String RENAME = "rename";
	public static final String SCRIPT = "script";
	public static final String SET = "set";
	public static final String SORT = "sort";
	public static final String SPLIT = "split";
	public static final String TRIM = "trim";
	public static final String UPPERCASE = "uppercase";
	public static final String URLDECODE = "urldecode";
	public static final String BYTES = "bytes";
	public static final String DISSECT = "dissect";
	public static final String SET_SECURITY_USER = "set_security_user";
	public static final String PIPELINE = "pipeline";
	public static final String DROP = "drop";
	public static final String CIRCLE = "circle";
	public static final String INFERENCE = "inference";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Processor(ProcessorVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Processor(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Processor of(Function<Builder, ObjectBuilder<Processor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code attachment} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code attachment} kind.
	 */
	public AttachmentProcessor attachment() {
		return TaggedUnionUtils.get(this, ATTACHMENT);
	}

	/**
	 * Get the {@code append} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code append} kind.
	 */
	public AppendProcessor append() {
		return TaggedUnionUtils.get(this, APPEND);
	}

	/**
	 * Get the {@code csv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code csv} kind.
	 */
	public CsvProcessor csv() {
		return TaggedUnionUtils.get(this, CSV);
	}

	/**
	 * Get the {@code convert} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code convert} kind.
	 */
	public ConvertProcessor convert() {
		return TaggedUnionUtils.get(this, CONVERT);
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateProcessor date() {
		return TaggedUnionUtils.get(this, DATE);
	}

	/**
	 * Get the {@code date_index_name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_index_name}
	 *             kind.
	 */
	public DateIndexNameProcessor dateIndexName() {
		return TaggedUnionUtils.get(this, DATE_INDEX_NAME);
	}

	/**
	 * Get the {@code dot_expander} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dot_expander} kind.
	 */
	public DotExpanderProcessor dotExpander() {
		return TaggedUnionUtils.get(this, DOT_EXPANDER);
	}

	/**
	 * Get the {@code enrich} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code enrich} kind.
	 */
	public EnrichProcessor enrich() {
		return TaggedUnionUtils.get(this, ENRICH);
	}

	/**
	 * Get the {@code fail} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fail} kind.
	 */
	public FailProcessor fail() {
		return TaggedUnionUtils.get(this, FAIL);
	}

	/**
	 * Get the {@code foreach} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code foreach} kind.
	 */
	public ForeachProcessor foreach() {
		return TaggedUnionUtils.get(this, FOREACH);
	}

	/**
	 * Get the {@code json} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code json} kind.
	 */
	public JsonProcessor json() {
		return TaggedUnionUtils.get(this, JSON);
	}

	/**
	 * Get the {@code user_agent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code user_agent} kind.
	 */
	public UserAgentProcessor userAgent() {
		return TaggedUnionUtils.get(this, USER_AGENT);
	}

	/**
	 * Get the {@code kv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kv} kind.
	 */
	public KeyValueProcessor kv() {
		return TaggedUnionUtils.get(this, KV);
	}

	/**
	 * Get the {@code geoip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geoip} kind.
	 */
	public GeoIpProcessor geoip() {
		return TaggedUnionUtils.get(this, GEOIP);
	}

	/**
	 * Get the {@code grok} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code grok} kind.
	 */
	public GrokProcessor grok() {
		return TaggedUnionUtils.get(this, GROK);
	}

	/**
	 * Get the {@code gsub} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gsub} kind.
	 */
	public GsubProcessor gsub() {
		return TaggedUnionUtils.get(this, GSUB);
	}

	/**
	 * Get the {@code join} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code join} kind.
	 */
	public JoinProcessor join() {
		return TaggedUnionUtils.get(this, JOIN);
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseProcessor lowercase() {
		return TaggedUnionUtils.get(this, LOWERCASE);
	}

	/**
	 * Get the {@code remove} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove} kind.
	 */
	public RemoveProcessor remove() {
		return TaggedUnionUtils.get(this, REMOVE);
	}

	/**
	 * Get the {@code rename} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rename} kind.
	 */
	public RenameProcessor rename() {
		return TaggedUnionUtils.get(this, RENAME);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public JsonValue /* _types.Script */ script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	/**
	 * Get the {@code set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set} kind.
	 */
	public SetProcessor set() {
		return TaggedUnionUtils.get(this, SET);
	}

	/**
	 * Get the {@code sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sort} kind.
	 */
	public SortProcessor sort() {
		return TaggedUnionUtils.get(this, SORT);
	}

	/**
	 * Get the {@code split} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code split} kind.
	 */
	public SplitProcessor split() {
		return TaggedUnionUtils.get(this, SPLIT);
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimProcessor trim() {
		return TaggedUnionUtils.get(this, TRIM);
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseProcessor uppercase() {
		return TaggedUnionUtils.get(this, UPPERCASE);
	}

	/**
	 * Get the {@code urldecode} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code urldecode} kind.
	 */
	public UrlDecodeProcessor urldecode() {
		return TaggedUnionUtils.get(this, URLDECODE);
	}

	/**
	 * Get the {@code bytes} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bytes} kind.
	 */
	public BytesProcessor bytes() {
		return TaggedUnionUtils.get(this, BYTES);
	}

	/**
	 * Get the {@code dissect} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dissect} kind.
	 */
	public DissectProcessor dissect() {
		return TaggedUnionUtils.get(this, DISSECT);
	}

	/**
	 * Get the {@code set_security_user} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set_security_user}
	 *             kind.
	 */
	public SetSecurityUserProcessor setSecurityUser() {
		return TaggedUnionUtils.get(this, SET_SECURITY_USER);
	}

	/**
	 * Get the {@code pipeline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pipeline} kind.
	 */
	public PipelineProcessor pipeline() {
		return TaggedUnionUtils.get(this, PIPELINE);
	}

	/**
	 * Get the {@code drop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code drop} kind.
	 */
	public DropProcessor drop() {
		return TaggedUnionUtils.get(this, DROP);
	}

	/**
	 * Get the {@code circle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code circle} kind.
	 */
	public CircleProcessor circle() {
		return TaggedUnionUtils.get(this, CIRCLE);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceProcessor inference() {
		return TaggedUnionUtils.get(this, INFERENCE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SCRIPT :
					generator.write(((JsonValue /* _types.Script */) this._value));

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Processor> {
		private String _type;
		private Object _value;

		public Builder attachment(AttachmentProcessor v) {
			this._type = ATTACHMENT;
			this._value = v;
			return this;
		}

		public Builder attachment(Function<AttachmentProcessor.Builder, ObjectBuilder<AttachmentProcessor>> f) {
			return this.attachment(f.apply(new AttachmentProcessor.Builder()).build());
		}

		public Builder append(AppendProcessor v) {
			this._type = APPEND;
			this._value = v;
			return this;
		}

		public Builder append(Function<AppendProcessor.Builder, ObjectBuilder<AppendProcessor>> f) {
			return this.append(f.apply(new AppendProcessor.Builder()).build());
		}

		public Builder csv(CsvProcessor v) {
			this._type = CSV;
			this._value = v;
			return this;
		}

		public Builder csv(Function<CsvProcessor.Builder, ObjectBuilder<CsvProcessor>> f) {
			return this.csv(f.apply(new CsvProcessor.Builder()).build());
		}

		public Builder convert(ConvertProcessor v) {
			this._type = CONVERT;
			this._value = v;
			return this;
		}

		public Builder convert(Function<ConvertProcessor.Builder, ObjectBuilder<ConvertProcessor>> f) {
			return this.convert(f.apply(new ConvertProcessor.Builder()).build());
		}

		public Builder date(DateProcessor v) {
			this._type = DATE;
			this._value = v;
			return this;
		}

		public Builder date(Function<DateProcessor.Builder, ObjectBuilder<DateProcessor>> f) {
			return this.date(f.apply(new DateProcessor.Builder()).build());
		}

		public Builder dateIndexName(DateIndexNameProcessor v) {
			this._type = DATE_INDEX_NAME;
			this._value = v;
			return this;
		}

		public Builder dateIndexName(
				Function<DateIndexNameProcessor.Builder, ObjectBuilder<DateIndexNameProcessor>> f) {
			return this.dateIndexName(f.apply(new DateIndexNameProcessor.Builder()).build());
		}

		public Builder dotExpander(DotExpanderProcessor v) {
			this._type = DOT_EXPANDER;
			this._value = v;
			return this;
		}

		public Builder dotExpander(Function<DotExpanderProcessor.Builder, ObjectBuilder<DotExpanderProcessor>> f) {
			return this.dotExpander(f.apply(new DotExpanderProcessor.Builder()).build());
		}

		public Builder enrich(EnrichProcessor v) {
			this._type = ENRICH;
			this._value = v;
			return this;
		}

		public Builder enrich(Function<EnrichProcessor.Builder, ObjectBuilder<EnrichProcessor>> f) {
			return this.enrich(f.apply(new EnrichProcessor.Builder()).build());
		}

		public Builder fail(FailProcessor v) {
			this._type = FAIL;
			this._value = v;
			return this;
		}

		public Builder fail(Function<FailProcessor.Builder, ObjectBuilder<FailProcessor>> f) {
			return this.fail(f.apply(new FailProcessor.Builder()).build());
		}

		public Builder foreach(ForeachProcessor v) {
			this._type = FOREACH;
			this._value = v;
			return this;
		}

		public Builder foreach(Function<ForeachProcessor.Builder, ObjectBuilder<ForeachProcessor>> f) {
			return this.foreach(f.apply(new ForeachProcessor.Builder()).build());
		}

		public Builder json(JsonProcessor v) {
			this._type = JSON;
			this._value = v;
			return this;
		}

		public Builder json(Function<JsonProcessor.Builder, ObjectBuilder<JsonProcessor>> f) {
			return this.json(f.apply(new JsonProcessor.Builder()).build());
		}

		public Builder userAgent(UserAgentProcessor v) {
			this._type = USER_AGENT;
			this._value = v;
			return this;
		}

		public Builder userAgent(Function<UserAgentProcessor.Builder, ObjectBuilder<UserAgentProcessor>> f) {
			return this.userAgent(f.apply(new UserAgentProcessor.Builder()).build());
		}

		public Builder kv(KeyValueProcessor v) {
			this._type = KV;
			this._value = v;
			return this;
		}

		public Builder kv(Function<KeyValueProcessor.Builder, ObjectBuilder<KeyValueProcessor>> f) {
			return this.kv(f.apply(new KeyValueProcessor.Builder()).build());
		}

		public Builder geoip(GeoIpProcessor v) {
			this._type = GEOIP;
			this._value = v;
			return this;
		}

		public Builder geoip(Function<GeoIpProcessor.Builder, ObjectBuilder<GeoIpProcessor>> f) {
			return this.geoip(f.apply(new GeoIpProcessor.Builder()).build());
		}

		public Builder grok(GrokProcessor v) {
			this._type = GROK;
			this._value = v;
			return this;
		}

		public Builder grok(Function<GrokProcessor.Builder, ObjectBuilder<GrokProcessor>> f) {
			return this.grok(f.apply(new GrokProcessor.Builder()).build());
		}

		public Builder gsub(GsubProcessor v) {
			this._type = GSUB;
			this._value = v;
			return this;
		}

		public Builder gsub(Function<GsubProcessor.Builder, ObjectBuilder<GsubProcessor>> f) {
			return this.gsub(f.apply(new GsubProcessor.Builder()).build());
		}

		public Builder join(JoinProcessor v) {
			this._type = JOIN;
			this._value = v;
			return this;
		}

		public Builder join(Function<JoinProcessor.Builder, ObjectBuilder<JoinProcessor>> f) {
			return this.join(f.apply(new JoinProcessor.Builder()).build());
		}

		public Builder lowercase(LowercaseProcessor v) {
			this._type = LOWERCASE;
			this._value = v;
			return this;
		}

		public Builder lowercase(Function<LowercaseProcessor.Builder, ObjectBuilder<LowercaseProcessor>> f) {
			return this.lowercase(f.apply(new LowercaseProcessor.Builder()).build());
		}

		public Builder remove(RemoveProcessor v) {
			this._type = REMOVE;
			this._value = v;
			return this;
		}

		public Builder remove(Function<RemoveProcessor.Builder, ObjectBuilder<RemoveProcessor>> f) {
			return this.remove(f.apply(new RemoveProcessor.Builder()).build());
		}

		public Builder rename(RenameProcessor v) {
			this._type = RENAME;
			this._value = v;
			return this;
		}

		public Builder rename(Function<RenameProcessor.Builder, ObjectBuilder<RenameProcessor>> f) {
			return this.rename(f.apply(new RenameProcessor.Builder()).build());
		}

		public Builder script(JsonValue /* _types.Script */ v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public Builder set(SetProcessor v) {
			this._type = SET;
			this._value = v;
			return this;
		}

		public Builder set(Function<SetProcessor.Builder, ObjectBuilder<SetProcessor>> f) {
			return this.set(f.apply(new SetProcessor.Builder()).build());
		}

		public Builder sort(SortProcessor v) {
			this._type = SORT;
			this._value = v;
			return this;
		}

		public Builder sort(Function<SortProcessor.Builder, ObjectBuilder<SortProcessor>> f) {
			return this.sort(f.apply(new SortProcessor.Builder()).build());
		}

		public Builder split(SplitProcessor v) {
			this._type = SPLIT;
			this._value = v;
			return this;
		}

		public Builder split(Function<SplitProcessor.Builder, ObjectBuilder<SplitProcessor>> f) {
			return this.split(f.apply(new SplitProcessor.Builder()).build());
		}

		public Builder trim(TrimProcessor v) {
			this._type = TRIM;
			this._value = v;
			return this;
		}

		public Builder trim(Function<TrimProcessor.Builder, ObjectBuilder<TrimProcessor>> f) {
			return this.trim(f.apply(new TrimProcessor.Builder()).build());
		}

		public Builder uppercase(UppercaseProcessor v) {
			this._type = UPPERCASE;
			this._value = v;
			return this;
		}

		public Builder uppercase(Function<UppercaseProcessor.Builder, ObjectBuilder<UppercaseProcessor>> f) {
			return this.uppercase(f.apply(new UppercaseProcessor.Builder()).build());
		}

		public Builder urldecode(UrlDecodeProcessor v) {
			this._type = URLDECODE;
			this._value = v;
			return this;
		}

		public Builder urldecode(Function<UrlDecodeProcessor.Builder, ObjectBuilder<UrlDecodeProcessor>> f) {
			return this.urldecode(f.apply(new UrlDecodeProcessor.Builder()).build());
		}

		public Builder bytes(BytesProcessor v) {
			this._type = BYTES;
			this._value = v;
			return this;
		}

		public Builder bytes(Function<BytesProcessor.Builder, ObjectBuilder<BytesProcessor>> f) {
			return this.bytes(f.apply(new BytesProcessor.Builder()).build());
		}

		public Builder dissect(DissectProcessor v) {
			this._type = DISSECT;
			this._value = v;
			return this;
		}

		public Builder dissect(Function<DissectProcessor.Builder, ObjectBuilder<DissectProcessor>> f) {
			return this.dissect(f.apply(new DissectProcessor.Builder()).build());
		}

		public Builder setSecurityUser(SetSecurityUserProcessor v) {
			this._type = SET_SECURITY_USER;
			this._value = v;
			return this;
		}

		public Builder setSecurityUser(
				Function<SetSecurityUserProcessor.Builder, ObjectBuilder<SetSecurityUserProcessor>> f) {
			return this.setSecurityUser(f.apply(new SetSecurityUserProcessor.Builder()).build());
		}

		public Builder pipeline(PipelineProcessor v) {
			this._type = PIPELINE;
			this._value = v;
			return this;
		}

		public Builder pipeline(Function<PipelineProcessor.Builder, ObjectBuilder<PipelineProcessor>> f) {
			return this.pipeline(f.apply(new PipelineProcessor.Builder()).build());
		}

		public Builder drop(DropProcessor v) {
			this._type = DROP;
			this._value = v;
			return this;
		}

		public Builder drop(Function<DropProcessor.Builder, ObjectBuilder<DropProcessor>> f) {
			return this.drop(f.apply(new DropProcessor.Builder()).build());
		}

		public Builder circle(CircleProcessor v) {
			this._type = CIRCLE;
			this._value = v;
			return this;
		}

		public Builder circle(Function<CircleProcessor.Builder, ObjectBuilder<CircleProcessor>> f) {
			return this.circle(f.apply(new CircleProcessor.Builder()).build());
		}

		public Builder inference(InferenceProcessor v) {
			this._type = INFERENCE;
			this._value = v;
			return this;
		}

		public Builder inference(Function<InferenceProcessor.Builder, ObjectBuilder<InferenceProcessor>> f) {
			return this.inference(f.apply(new InferenceProcessor.Builder()).build());
		}

		public Processor build() {
			_checkSingleUse();
			return new Processor(this);
		}

	}

	protected static void setupProcessorDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::attachment, AttachmentProcessor._DESERIALIZER, "attachment");
		op.add(Builder::append, AppendProcessor._DESERIALIZER, "append");
		op.add(Builder::csv, CsvProcessor._DESERIALIZER, "csv");
		op.add(Builder::convert, ConvertProcessor._DESERIALIZER, "convert");
		op.add(Builder::date, DateProcessor._DESERIALIZER, "date");
		op.add(Builder::dateIndexName, DateIndexNameProcessor._DESERIALIZER, "date_index_name");
		op.add(Builder::dotExpander, DotExpanderProcessor._DESERIALIZER, "dot_expander");
		op.add(Builder::enrich, EnrichProcessor._DESERIALIZER, "enrich");
		op.add(Builder::fail, FailProcessor._DESERIALIZER, "fail");
		op.add(Builder::foreach, ForeachProcessor._DESERIALIZER, "foreach");
		op.add(Builder::json, JsonProcessor._DESERIALIZER, "json");
		op.add(Builder::userAgent, UserAgentProcessor._DESERIALIZER, "user_agent");
		op.add(Builder::kv, KeyValueProcessor._DESERIALIZER, "kv");
		op.add(Builder::geoip, GeoIpProcessor._DESERIALIZER, "geoip");
		op.add(Builder::grok, GrokProcessor._DESERIALIZER, "grok");
		op.add(Builder::gsub, GsubProcessor._DESERIALIZER, "gsub");
		op.add(Builder::join, JoinProcessor._DESERIALIZER, "join");
		op.add(Builder::lowercase, LowercaseProcessor._DESERIALIZER, "lowercase");
		op.add(Builder::remove, RemoveProcessor._DESERIALIZER, "remove");
		op.add(Builder::rename, RenameProcessor._DESERIALIZER, "rename");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::set, SetProcessor._DESERIALIZER, "set");
		op.add(Builder::sort, SortProcessor._DESERIALIZER, "sort");
		op.add(Builder::split, SplitProcessor._DESERIALIZER, "split");
		op.add(Builder::trim, TrimProcessor._DESERIALIZER, "trim");
		op.add(Builder::uppercase, UppercaseProcessor._DESERIALIZER, "uppercase");
		op.add(Builder::urldecode, UrlDecodeProcessor._DESERIALIZER, "urldecode");
		op.add(Builder::bytes, BytesProcessor._DESERIALIZER, "bytes");
		op.add(Builder::dissect, DissectProcessor._DESERIALIZER, "dissect");
		op.add(Builder::setSecurityUser, SetSecurityUserProcessor._DESERIALIZER, "set_security_user");
		op.add(Builder::pipeline, PipelineProcessor._DESERIALIZER, "pipeline");
		op.add(Builder::drop, DropProcessor._DESERIALIZER, "drop");
		op.add(Builder::circle, CircleProcessor._DESERIALIZER, "circle");
		op.add(Builder::inference, InferenceProcessor._DESERIALIZER, "inference");

	}

	public static final JsonpDeserializer<Processor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Processor::setupProcessorDeserializer, Builder::build);
}
